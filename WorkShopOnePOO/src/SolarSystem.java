import java.text.ParseException;
/**
 * Clase que representa el sistema solar
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0
 */
public abstract class SolarSystem {
	/**
	 * Atributo tipo int el id de un planeta.
	 */
	int id;
	/**
	 * Atributo tipo String el name de un planeta.
	 */
	String name;
	/**
	 * Atributo tipo Planet un planeta.
	 */
	Planet planet;		
	/**
	 * Metodo constructor que permite instanciar
	 * @throws ParseException
	 */
	public SolarSystem() throws ParseException {		
	}	
	/**
	 * Metodo constructor que permite instanciar cada una de sus variables
	 * @throws ParseException
	 */
	public SolarSystem(int id,String name) throws ParseException {
		this.id=0;
		this.name="";		
	}	
	/**
	 *  Metodo accesor que permite obtener el id de un planeta del sistema solar
	 * @return
	 */
	public int getId() {
		return id;
	}
	/**
	 * Metodo accesor que permite modificar el id de un planeta del sistema solar
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * Metodo accesor que permite obtener el name de un planeta del sistema solar
	 * @return
	 */
	public String getName() {
		return name;
	}	
	/**
	 * Metodo accesor que permite modificar el name de un planeta del sistema solar
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}		
}