import java.text.ParseException;
import javax.swing.JOptionPane;
/**
 *Esta es la clase main donde se realiza se llama a los respectivos metodos para calcular atracción gravitatoria entre dos cuerpos cualesquiera del sistema. 
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0  *
 */
public class Main {
	/**
	 * Main donde se solicita variables de los dos planetas  para realizar la atracción gravitatoria del sistema solar.
	 * @author Daniel Steven Gil Cruz
	 * @version 1.0.0	 
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {			
        try {
        	PlanetList planetlist = new PlanetList();
    		String name1 = JOptionPane.showInputDialog("Introduzca el nombre del 1 planeta\n");
    		String name2 = JOptionPane.showInputDialog("Introduzca el nombre del 2 planeta\n");
    		planetlist.calculateGravitationalLaw(name1, name2, planetlist.listOfPlanets);              
        }catch (Exception e){
            //Capturando la excepción
            JOptionPane.showMessageDialog(null, "Elemento no encontrado \n");
            System.out.println("Error: "+e);
        }		
	}	
}