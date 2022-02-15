/**
 * Metodo que respresenta la clase bote que extiende de vehiculo
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0
 */
public class Boat extends Vehicle {
	/**
	 * Variable de tipo int que representa el numero de motores
	 */
	int numberOfMotors;
	/**
	 * Metodo constructor que nos permite instanciar las variables
	 * @param id ID del camion
	 * @param name nombre del cambion
	 * @param numberOfPassengers Numero de pasajeros
	 * @param passengers Presencia o ausencia de pasajeros
	 * @param date Fecha de matricula
	 * @param numberOfMotors numero motores
	 */	
	public Boat(int id,String name,int numberOfPassengers,String passengers,String date,int NumberOfMotors) {
		super(id,name,numberOfPassengers, passengers,date);		
		this.numberOfMotors = NumberOfMotors;
	}	
	/**
	 * Metodo para obtener el numero de motores del bote
	 * @return
	 */
	public int getNumberOfMotors() {
		return numberOfMotors;
	}
	/**
	 * Metodo para modificar el numero de motores del bote
	 * @param numberOfMotors
	 */
	public void setNumberOfMotors(int numberOfMotors) {
		this.numberOfMotors = numberOfMotors;
	}
	/**
	 * Metodo para imprimir los datos por pantalla
	 */
	@Override
	public String toString() {
		return "Boat [numberOfMotors=" + numberOfMotors + ", id=" + id + ", name=" + name + ", numberOfPassengers="
				+ numberOfPassengers + ", passengers=" + passengers + ", date=" + date + "]";
	}
}