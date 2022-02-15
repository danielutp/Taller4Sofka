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
	public ArrayList<Vehicle> createdListVehicles() {
		int i = 0;
		Vehicle aux;
		ArrayList<Vehicle> populateVehicles = new ArrayList<Vehicle>();
		for (i = 1; i <= 10; i++) {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del vehiculo\n"));
			String name = JOptionPane.showInputDialog("Ingresa el nombre del vehiculo\n");
			int numberOfPassengers = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de pasajeros del vehiculo\n"));
			String passengers = JOptionPane.showInputDialog("Escriba Si en caso de que el vehiculo tenga pasajeros\n");
			String date = JOptionPane.showInputDialog("Ingresa la fecha del vehiculo YYYY/MM/DD \n");
			aux = new Vehicle(); 
            aux.setId(id);
            aux.setName(name);
            aux.setNumberOfPassengers(numberOfPassengers);
            aux.setPassengers(passengers);
            aux.setDate(date);
            populateVehicles.add(aux);
		}
		return populateVehicles;
	}
	/**
	 * Metodo para recorrer la lista de vehiculos e imprimirlos por pantalla.
	 * @param listVehicles
	 */
	public void showVehicles(ArrayList<Vehicle> listVehicles) {
		for (Vehicle vehicle : listVehicles) {
			JOptionPane.showInputDialog("Id del vehiculo : "+vehicle.id+"\n"+"Nombre : "+vehicle.name+"\n"+
					"Numero de pasajeros : "+vehicle.numberOfPassengers+"\n"+"Tiene pasajeros? : "+
					 vehicle.Passengers+"\n"+"Fecha de matricula : "+vehicle.date);					
		}		
	}
}