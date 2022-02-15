/**
 * Clase que representa la clase vehiculo con todos sus atributos y metodos.
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0
 */
public class Vehicle {
	/**
	 * Atributo de tipo int que representa el id de un vehiculo.
	 */
	int id;
	/**
	 * Atributo de tipo String que representa el nombre de un vehiculo.
	 */
	String name;
	/**
	 * Atributo de tipo int que representa el numero de pasajeros de un vehiculo.
	 */
	int numberOfPassengers;
	/**
	 * Atributo de tipo String que representa si unvehiculo tiene pasajeros.
	 */
	String Passengers;
	/**
	 * Atributo de tipo String que representa la fecha de matricula de un vehiculo.
	 */
	String date;
	/**
	 *Metodo constructor que nos permite instanciar.
	 */
	public Vehicle() {		
	}
	/**
	 * Metodo constructor que nos permite instanciar sus variables.
	 * @param id Id del vehiculo.
	 * @param name Nombre del vehiculo.
	 * @param numberOfPassengers Numero de pasajeros.
	 * @param Passengers Presencia o ausencia de pasajeros.
	 * @param date Fecha de matricula
	 */
	public Vehicle(int id,String name,int numberOfPassengers,String Passengers,String date) {
		this.id = id;
		this.name = name;
		this.numberOfPassengers = numberOfPassengers;
		this.Passengers = Passengers;
		this.date = date;
	}
	/**
	 * Metodo que nos permite obtener el ID de un vehiculo.
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * Metodo que nos permite modificar el ID de un vehiculo.
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Metodo que nos permite obtener el nombre de un vehiculo.
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * Metodo que nos permite modificar el nombre de un vehiculo.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Metodo que nos permite obtener el numero de pasajeros de un vehiculo.
	 * @return
	 */
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	/**
	 * Metodo que nos permite modificar el numero de pasajeros de un vehiculo.
	 * @param numberOfPassengers
	 */
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	/**
	 * Metodo que nos permite obtener el presencia o ausencia de pasajeros de un vehiculo.
	 * @return
	 */
	public String getPassengers() {
		return Passengers;
	}
	/**
	 * Metodo que nos permite modificar el presencia o ausencia de pasajeros de un vehiculo.
	 * @param passengers
	 */
	public void setPassengers(String passengers) {
		Passengers = passengers;
	}
	/**
	 * Metodo que nos permite obtener la fecha de matricula de un vehiculo de un vehiculo.
	 * @return
	 */
	public String getDate() {
		return date;
	}
	/**
	 * Metodo que nos permite modificar la fecha de matricula de un vehiculo de un vehiculo.
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}
}