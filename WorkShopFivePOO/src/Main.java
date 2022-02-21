import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * Representa la clase main donde segun la peticion del cliente se agregara a una lista de vehiculos el vehiculo desado
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0
 */
public class Main {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Bienvenido a la creacion de vehiculos");
		int opcion = 0;
		ArrayList<Vehicle> listVehicles = new ArrayList<Vehicle>();		
		try {
			do {			
				opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al sistema creacion de vehiculos\n"+"\n"+
	    				"Ingrese la opcion 1 para crear carro\n"+"Ingrese la opcion 2 para crear una bicicleta\n"+
	    				"Ingrese la opcion 3 para crear un bote\n"+"Ingrese la opcion 4 para crear un moto\n"+
	    				"Ingrese la opcion 5 para crear un camion\n"+"Ingrese la opcion 6 para salir del sistema\n"));
			switch(opcion){						
	            case 1 :
	            	int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del vehiculo\n"));
					String name = JOptionPane.showInputDialog("Ingresa el nombre del vehiculo\n");
					int numberOfPassengers = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de pasajeros del vehiculo\n"));
					String passengers = JOptionPane.showInputDialog("Escriba Si en caso de que el vehiculo tenga pasajeros\n");
					String date = JOptionPane.showInputDialog("Ingresa la fecha del vehiculo YYYY/MM/DD \n");
					int door = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero de puertas del vehiculo\n"));
					Car car = new Car(id,name,numberOfPassengers,passengers,date,door);
					listVehicles.add(car);
					break;	        				                
	            case 2 :
	            	int id1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del vehiculo\n"));
					String name1 = JOptionPane.showInputDialog("Ingresa el nombre del vehiculo\n");
					int numberOfPassengers1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de pasajeros del vehiculo\n"));
					String passengers1 = JOptionPane.showInputDialog("Escriba Si en caso de que el vehiculo tenga pasajeros\n");
					String date1 = JOptionPane.showInputDialog("Ingresa la fecha del vehiculo YYYY/MM/DD \n");
					int numberOfChanges = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero de cambios\n"));
					Bicycle bicycle = new Bicycle(id1,name1,numberOfPassengers1,passengers1,date1,numberOfChanges);
					listVehicles.add(bicycle);
	            	break;
	            case 3 :
	            	int id2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del vehiculo\n"));
					String name2 = JOptionPane.showInputDialog("Ingresa el nombre del vehiculo\n");
					int numberOfPassengers2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de pasajeros del vehiculo\n"));
					String passengers2 = JOptionPane.showInputDialog("Escriba Si en caso de que el vehiculo tenga pasajeros\n");
					String date2 = JOptionPane.showInputDialog("Ingresa la fecha del vehiculo YYYY/MM/DD \n");
					int numberOfMotors = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero de motores\n"));
					Boat boat = new Boat(id2,name2,numberOfPassengers2,passengers2,date2,numberOfMotors);
					listVehicles.add(boat);
	            	break;
	            case 4 :
	            	int id3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del vehiculo\n"));
					String name3 = JOptionPane.showInputDialog("Ingresa el nombre del vehiculo\n");
					int numberOfPassengers3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de pasajeros del vehiculo\n"));
					String passengers3 = JOptionPane.showInputDialog("Escriba Si en caso de que el vehiculo tenga pasajeros\n");
					String date3 = JOptionPane.showInputDialog("Ingresa la fecha del vehiculo YYYY/MM/DD \n");
					int tireNumbers = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero de neumaticos\n"));
					Motorcycle motorcycle = new Motorcycle(id3,name3,numberOfPassengers3,passengers3,date3,tireNumbers);
					listVehicles.add(motorcycle);	            	
	            	break;
	            case 5 :
	            	int id4 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del vehiculo\n"));
					String name4 = JOptionPane.showInputDialog("Ingresa el nombre del vehiculo\n");
					int numberOfPassengers4 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de pasajeros del vehiculo\n"));
					String passengers4 = JOptionPane.showInputDialog("Escriba Si en caso de que el vehiculo tenga pasajeros\n");
					String date4 = JOptionPane.showInputDialog("Ingresa la fecha del vehiculo YYYY/MM/DD \n");
					int axleNumbers = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero de ejes\n"));
					Truck truck = new Truck(id4,name4,numberOfPassengers4,passengers4,date4,axleNumbers);
					listVehicles.add(truck);
	            	break;
	            case 6:
	            	JOptionPane.showMessageDialog(null,"Has finalizando la creacion de vehiculos");
	            	break;
	            default:
	            	JOptionPane.showMessageDialog(null,"no coincide");
	                break;
			}			
			} while (opcion !=6);
		}catch (Exception e){
            //Capturando la excepción
            JOptionPane.showMessageDialog(null, "Error.. \n");
        }	
		ListVehicles listVehicles1 = new ListVehicles();		
		listVehicles1.showVehicles(listVehicles);
	}
}
