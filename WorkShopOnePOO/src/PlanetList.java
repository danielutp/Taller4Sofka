import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 * Clase que representa una lista de planetas.
 * @author Daniel Steven Gil Cruz.
 * @version 1.0.0.
 */
public class PlanetList {
	/**
	 * Se crea la varibles de tipo ArrayList<Planet> que tiene una lista de los planetas.
	 */
	ArrayList<Planet> listOfPlanets;	
	/**
	 * Metodo constructor que permite instanciar una lista de planetas.
	 * @throws ParseException
	 */
	public PlanetList() throws ParseException {
		this.listOfPlanets = populatePlanets();
	}
	/**
	 * Metodo constructor que permite instanciar una lista de planetas.
	 * @param listOfPlanets
	 */
	public PlanetList(ArrayList<Planet> listOfPlanets) {
		this.listOfPlanets = listOfPlanets;
	}	
	/**
	 * Metodo para obtener una lista de planetas.	
	 * @return listOfPlanets
	 */
	public ArrayList<Planet> getListOfPlanets() {
		return listOfPlanets;
	}
	/**
	 * Metodo para modificar una lista de planetas.
	 * @param listOfPlanets
	 */
	public void setListOfPlanets(ArrayList<Planet> listOfPlanets) {
		this.listOfPlanets = listOfPlanets;
	}
	/**
	 * Metodo para crear un ArrayList<Planet> que contiene una lista con planetas ya determinados.
	 * @return planetList la lista de planetas
	 * @throws ParseException
	 */
	public ArrayList<Planet> populatePlanets() throws ParseException {
		ArrayList<Planet> planetList = new ArrayList<Planet>();
		Planet planet = new Planet(1,"Mercurio",3.302E23,5.43,4879.4,70000000);
		Planet planet1 = new Planet(2,"Venus",4.869E24, 5.24,12103.6,180000000);
		Planet planet2 = new Planet(3,"Tierra",5.9736E24,5.515,12742,149597870);
		Planet planet3 = new Planet(4,"Marte",6.4185E23, 3.9335,6794.4,249100000);
		Planet planet4 = new Planet(5,"Jupiter",1.899E27,1336 ,142984,750000000);
		planetList.add(planet);
		planetList.add(planet1);
		planetList.add(planet2);
		planetList.add(planet3);
		planetList.add(planet4);
		return planetList;
	}	
	/**
	 * Metodo para calcular la atracción gravitatoria entre dos cuerpos cualquiera del sistema.
	 * @param name1 nombre del primer planeta
	 * @param name2 nombre del segundo planeta
	 * @param planetList lista de planetas del sistema solar
	 * @throws ParseException
	 */
	public void calculateGravitationalLaw(String name1, String name2,ArrayList<Planet> planetList) throws ParseException {
		Planet firstPlanet = new Planet();
		Planet secondPlanet = new Planet();
		for (Planet planet1 : planetList) {
			if (planet1.name.equalsIgnoreCase(name1)) {
				firstPlanet = planet1;
			}
		}		
		for (Planet planet2 : planetList) {
			if (planet2.name.equalsIgnoreCase(name2)) {
				secondPlanet = planet2;
			}
		}
		if (firstPlanet.getMass() != 0 && secondPlanet.getMass() != 0) {
			double distance =  Math.abs(firstPlanet.getDistanceToSun() - secondPlanet.distanceToSun);
			double constantGravitational = 6.39E23*firstPlanet.getMass() * secondPlanet.getMass() / Math.pow(distance, 2);
			JOptionPane.showMessageDialog(null, "La atraccion gravitatoria entre los planetas . \n"+constantGravitational);
		}
	}	
}