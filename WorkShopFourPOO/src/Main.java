import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Clase main donde se llama a los metodos correspondientes para la creacion de una lista de vehiculos
 * @author Daniel Steven Gil Cruz
 *
 */
public class Main {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Bienvenido a la creacion de vehiculos");
		try {		
			ListVehicles listVehicles = new ListVehicles();
			ArrayList list = listVehicles.createdListVehicles();
			listVehicles.showVehicles(list);
		}catch (Exception e){
            //Capturando la excepción
            JOptionPane.showMessageDialog(null, "Error...\n");
        }
	}
}
