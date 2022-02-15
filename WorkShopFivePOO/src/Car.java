/**
 * Metodo que respresenta la clase carro que extiende de vehiculo
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0
 */
public class Car extends Vehicle {
	/**
	 * Variable que representa el numero de puertas de vehiculos
	 */
	int numberOfDoors;
	/**
	 * Metodo constructor que nos permite instanciar las variables
	 * @param id ID del camion
	 * @param name nombre del cambion
	 * @param numberOfPassengers Numero de pasajeros
	 * @param passengers Presencia o ausencia de pasajeros
	 * @param date Fecha de matricula
	 * @param numberOfDoors numero puertas
	 */
	public Car(int id,String name,int numberOfPassengers,String passengers,String date,int numberOfDoors) {
		super(id,name,numberOfPassengers, passengers,date);		
		this.numberOfDoors = numberOfDoors;
	}
	/**
	 * Metodo para obtener el numero de puertas de un carro
	 * @return
	 */
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	/**
	 * Metodo para modificar el numero de puertas de un carro
	 * @param numberOfDoors
	 */
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	/**
	 * Metodo para imprimir los datos por pantalla
	 */
	@Override
	public String toString() {
		return "Carro [numberOfDoors=" + numberOfDoors +"/n"+", id=" + id +"/n"+ ", name=" + name + "/n"+", numberOfPassengers="
				+ numberOfPassengers + "/n" +", passengers=" + passengers +"/n"+ ", date=" + date + "/n"+"]";		
	}
}