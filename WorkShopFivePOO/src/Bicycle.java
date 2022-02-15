/**
 * Metodo que respresenta la clase bote que extiende de vehiculo
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0
 */
public class Bicycle extends Vehicle {
	/**
	 * variable de tipo int que representa el numero de cambios
	 */
	int numberOfChanges;
	/**
	 * Metodo constructor que nos permite instanciar las variables
	 * @param id ID del camion
	 * @param name nombre del cambion
	 * @param numberOfPassengers Numero de pasajeros
	 * @param passengers Presencia o ausencia de pasajeros
	 * @param date Fecha de matricula
	 * @param numberOfChanges numero cambios
	 */	
	public Bicycle(int id,String name,int numberOfPassengers,String passengers,String date,int numberOfChanges) {
		super(id,name,numberOfPassengers, passengers,date);		
		this.numberOfChanges = numberOfChanges;
	}
	/**
	 * Metodo para obtener el numero de cambio de una bicicleta
	 * @return numberOfChanges
	 */
	public int getNumberOfChanges() {
		return numberOfChanges;
	}
	/**
	 * Metodo para obtener el numero de cambio de una bicicleta
	 * @param numberOfChanges
	 */
	public void setNumberOfChanges(int numberOfChanges) {
		this.numberOfChanges = numberOfChanges;
	}
	/**
	 * Metodo para imprimir los datos por pantalla
	 */
	@Override
	public String toString() {
		return "Bicicleta [numberOfChanges=" + numberOfChanges + ", id=" + id + ", name=" + name + ", numberOfPassengers="
				+ numberOfPassengers + ", passengers=" + passengers + ", date=" + date + "]";
	}	
}