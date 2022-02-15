import java.util.Vector;
import javax.swing.JOptionPane;
/**
 * Clase main donde se realizar vector de n posiciones todo esto hasta que el cliente ingrese dos veces el mismo numero seguidos.
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0
 */
public class Main {
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null,"Bienvenido a la creacion de un vecto de N numeros");
		int n = 100;
		int number = 0;
		Vector<Integer> v = new Vector<Integer>(n);
		for (int i = 0; i <= n; i++){
			try {
				number = Integer.parseInt(JOptionPane.showInputDialog("Ingresa en numero que desea ingresar\n"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null , e, "error", 1);
			}
			if(v.size() != 0) {
				try {
					if (number == v.get(i-1)) {
						JOptionPane.showMessageDialog(null,"Has ingresado dos veces el mismo numero"+
								"/n"+"Se imprimira la lista de numero creada");
						break;					
					}else {
						v.add(number);
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null , e, "error", 1);
				}
			} else {
				v.add(number);
			}
		}
		for (int i = 0; i < v.size(); i++) {
			JOptionPane.showMessageDialog(null,v.get(i) + " ");
		}
	}
}