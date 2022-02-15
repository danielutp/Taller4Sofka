import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Clase que representa una lista de vehiculos.
 * @author Daniel Steven Gil Cruz.
 * @version 1.0.0.
 */
public class ListVehicles {
	/**
	 * Se crea la varibles de tipo ArrayList<Vehicle> que tiene una lista de vehiculos.
	 */
	ArrayList<Vehicle> listVehicles;
	/**
	 * Metodo constructor que permite instanciar una lista de vehiculos.	
	 */
	public ListVehicles() {		
	}
	/**
	 * Metodo constructor que permite instanciar una lista de vehiculos.
	 * @param listVehicles
	 */
	public ListVehicles(ArrayList<Vehicle> listVehicles) {
		this.listVehicles = listVehicles;
	}
	/**
	 * Metodo para obtener una lista de vehiculos.	
	 * @return listVehicles
	 */	
	public ArrayList<Vehicle> getListVehicles() {
		return listVehicles;
	}
	/**
	 * Metodo para modificar una lista de vehiculos.
	 * @param listVehicles
	 */
	public void setListVehicles(ArrayList<Vehicle> listVehicles) {
		this.listVehicles = listVehicles;
	}
	/**
	 * Metodo para crear un ArrayList<Vehicle> con los vehiculos deseados.
	 * @return
	 */
	public void addVehicle(Vehicle vehicle) {
		listVehicles.add(vehicle);
	}
	/**
	 * Metodo para mostrar una lista de vehiculos
	 * @param listVehicles
	 */
	public void showVehicles(ArrayList<Vehicle> listVehicles) {
		for (Vehicle vehicle : listVehicles) {			
			JOptionPane.showInputDialog(vehicle.toString());					
		}		
	}
}