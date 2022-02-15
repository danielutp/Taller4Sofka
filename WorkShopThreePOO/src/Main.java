import javax.swing.JOptionPane;
/**
 * Esto es un sistema para ordenar una lista de datos con los algoritmos de la burbuja o mediante quick sort, * 
 * en este menu se crea un vector de 10 numero para posteriormente realizar el ordenamiento dependiendo de como lo quiera
 * el usuario
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0  *
 */
public class Main {
	public static void main(String[] args) {
		int num1=0;
        int num2=100;
        int izq = 0;
        int der = 9;
        int arreglo[] = new int[10];
        JOptionPane.showMessageDialog(null, "Se creara una lista de numeros aleatoriamente \n");   
        for (int i=0;i<arreglo.length;i++){
            int numAleatorio=(int)Math.floor(Math.random()*(num1-num2)+num2);
            arreglo[i]= numAleatorio;
            JOptionPane.showMessageDialog(null, "La lista creada por defecto es : \n"+ arreglo[i]);           
        }        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido ingrese 1 para ordenar algoritmo de la burbuja \n"+
        		"Bienvenido ingrese 2 para ordenar quick sort \n"));
        try {		
			if (opcion == 1 ) {	
				Order order = new Order();
				order.orderList(arreglo);
			}else { 
				Order order = new Order();
				int[] list = order.orderlistnew(arreglo, izq, der);	
				for (int i = 0; i < list.length; i++) {
					JOptionPane.showMessageDialog(null, "La lista ordenada es : \n"+ list[i]);
				}
			}
        }
        catch (ArrayIndexOutOfBoundsException exc){
            //Capturando la excepción
            JOptionPane.showMessageDialog(null, "Elemento no encontrado \n");
        }
	}
}