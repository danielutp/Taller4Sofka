/**
 * Metodo que respresenta la clase camion que extiende de vehiculo
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0
 */
public class Truck extends Vehicle {
	/**
	 * Variable de tipo int que representa el numero de ejes de un camion.
	 */
	int axleNumbers;
	/**
	 * Metodo constructor que nos permite instanciar las variables
	 * @param id ID del camion
	 * @param name nombre del cambion
	 * @param numberOfPassengers Numero de pasajeros
	 * @param passengers Presencia o ausencia de pasajeros
	 * @param date Fecha de matricula
	 * @param axleNumbers numero de ejes del camion
	 */
	public Truck(int id,String name,int numberOfPassengers,String passengers,String date,int axleNumbers) {
		super(id,name,numberOfPassengers, passengers,date);		
		this.axleNumbers = axleNumbers;
	}	
	/**
	 * Metodo que nos permite obtener el numero de ejes del camion.
	 * @return
	 */
	public int getAxleNumbers() {
		return axleNumbers;
	}
	/**
	 * Metodo que nos permite modificar el numero de ejes del camion.	
	 * @param axleNumbers
	 */
	public void setAxleNumbers(int axleNumbers) {
		this.axleNumbers = axleNumbers;
	}
	/**
	 * Metodo para realizar impresion de las variables del camion.
	 */
	@Override
	public String toString() {
		return "Truck [axleNumbers=" + axleNumbers + ", id=" + id + ", name=" + name + ", numberOfPassengers="
				+ numberOfPassengers + ", passengers=" + passengers + ", date=" + date + "]";		
	}	
}