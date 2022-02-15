import java.text.ParseException;
/**
 * Clase que representa un planeta, sus atributos y algunos metodos para acceder y modificar los mismos.
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0 
 */
public class Planet extends SolarSystem {
	/**
	 * Atributo tipo double que representa masa de un planeta.
	 */
	double mass;
	/**
	 * Atributo tipo double que representa densidad de un planeta.
	 */
	double density;
	/**
	 * Atributo tipo double que representa diametro de un planeta.
	 */
	double diameter;
	/**
	 * Atributo tipo double que representa distancia al sol de un planeta.
	 */
	double distanceToSun;	
	/**
	 * Metodo constructor que permite instanciar
	 * @throws ParseException
	 */
	public Planet()throws ParseException{
		mass = 0;
		density = 0;
		diameter = 0;
		distanceToSun = 0.0;
	}	
	/**
	 * Metodo constructor que permite instanciar cada una de sus variables
	 * @throws ParseException
	 */
	public Planet(int id,String name,double mass,double density,double diameter,double distanceToSun) throws ParseException{
		this.id = id;
		this.name = name;
		this.mass = mass;
		this.density = density;
		this.diameter = diameter;
		this.distanceToSun = distanceToSun;		
	}	
	/**
	 * Metodo accesor que permite obtener la masa de un planeta
	 * @return
	 */
	public double getMass() {
		return mass;
	}
	/**
	 * Metodo accesor que permite modificar la masa de un planeta.
	 * @param mass
	 */
	public void setMass(double mass) {
		this.mass = mass;
	}
	/**
	 *  Metodo accesor que permite obtener la densidad de un planeta.
	 * @return
	 */
	public double getDensity() {
		return density;
	}
	/**
	 * Metodo accesor que permite modificar la densidad de un planeta.
	 * @param density
	 */
	public void setDensity(double density) {
		this.density = density;
	}	
	/**
	 * Metodo accesor que permite obtener la diametro de un planeta
	 * @return
	 */
	public double getDiameter() {
		return diameter;
	}
	/**
	 *  Metodo accesor que permite modificar el diametro de un planeta.
	 * @param diameter
	 */
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	/**
	 * Metodo accesor que permite obtener la distancia al sol de un planeta
	 * @return
	 */
	public double getDistanceToSun() {
		return distanceToSun;
	}
	/**
	 *  Metodo accesor que permite modificar el distancia al sol de un planeta.
	 * @param distanceToSun
	 */
	public void setDistanceToSun(double distanceToSun) {
		this.distanceToSun = distanceToSun;
	}		
}