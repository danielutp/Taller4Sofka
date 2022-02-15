/**
 * Metodo que respresenta la clase moto que extiende de vehiculo
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0
 */
public class Motorcycle extends Vehicle {
	/**
	 * Variable que reprensenta el numero de neumaticos
	 */
	int tireNumbers;
	/**
	 * Metodo constructor que nos permite instanciar las variables
	 * @param id ID del camion
	 * @param name nombre del cambion
	 * @param numberOfPassengers Numero de pasajeros
	 * @param passengers Presencia o ausencia de pasajeros
	 * @param date Fecha de matricula
	 * @param tireNumbers numero de neumaticos
	 */
	public Motorcycle(int id,String name,int numberOfPassengers,String passengers,String date,int tireNumbers) {
		super(id,name,numberOfPassengers, passengers,date);		
		this.tireNumbers = tireNumbers;
		}		
	/**
	 * Metodo que nos permite obtener el numero de neumaticos de una moto
	 * @return
	 */
	public int getTireNumbers() {
		return tireNumbers;
	}
	/**
	 * Metodo que nos permite modificar el numero de neumaticos de una moto
	 * @return
	 */
	public void setTireNumbers(int tireNumbers) {
		this.tireNumbers = tireNumbers;
	}	
	/**
	 * Metodo para realizar impresion de las variables de la moto.
	 */
	@Override
	public String toString() {
		return "Motorcycle [tireNumbers=" + tireNumbers + ", id=" + id + ", name=" + name + ", numberOfPassengers="
				+ numberOfPassengers + ", passengers=" + passengers + ", date=" + date + "]";	
	}
}