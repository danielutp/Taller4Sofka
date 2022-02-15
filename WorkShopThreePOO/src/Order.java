import javax.swing.JOptionPane;
/**
 * Clase Order donde implementamos los metodos para que el usuario elija cual metodo usar
 * @author Daniel Steven Gil Cruz
 * @version 1.0.0  *
 */

public class Order {
	/**
	 *variable que nos ayudara como un auxiliara para guardar la lista arreglada temporalmente.
	 */
	int aux=0;
	
	public Order() {
	}
	/**
	 * Metodo para ordenar una lista mediante algoritmo de la burbuja 
	 * @param arreglo Lista de datos ya creada previamente aleatoriamente
	 */
	public void orderList(int arreglo[]) {	
			for (int i = 0; i < arreglo.length-1; i++) {
				for (int j = i + 1; j < arreglo.length; j++) {
					if (arreglo[i] > arreglo[j]){
						aux = arreglo[i];
						arreglo[i] = arreglo[j];
						arreglo[j] = aux;
				}
			}
		}
		for (int i = 0; i < arreglo.length; i++) {
			JOptionPane.showMessageDialog(null, "La lista ordenada es : \n"+ arreglo[i]);			
	}
	}
		/**
		 * Metodo para ordenar una lista mediante algoritmo quick sort.
		 * @param arreglo Lista de datos ya creada previamente aleatoriamente.
		 * @param izq  el primer elemnto del array a tratar en cada momento.
		 * @param der  último elemento del array a tratar en cada momento.
		 * @return arreglo lista ya ordenada.
		 */
		public int[] orderlistnew(int arreglo[],int izq, int der) {
			int pivote=arreglo[izq];
			int i = izq;
			int j = der;         
			  while(i < j){                                                             
			     while(arreglo[i] <= pivote && i < j) i++; 
			     while(arreglo[j] > pivote) j--;           
			     if (i < j) {                                            
			    	 aux= arreglo[i];                      
			         arreglo[i]=arreglo[j];
			         arreglo[j]=aux;
			     }
			   }			   
			  arreglo[izq]=arreglo[j];                                       
			  arreglo[j]=pivote;  
			   if(izq < j-1)
				   orderlistnew(arreglo,izq,j-1);          
			   if(j+1 < der)
				   orderlistnew(arreglo,j+1,der); 
			   return arreglo;		
				}
			}