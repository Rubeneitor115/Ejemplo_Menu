/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

import java.util.Scanner;

/**
 * Clase principal de la aplicación
 * rbr - 270924
 */
public class Principal {

	/**
	 * Método principal de la aplicación
	 * rbr - 270924
	 * @param args
	 */
	public static void main(String[] args) {


		//Variables
		boolean seCierra = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			   //Muestro el menú por consola
			   System.out.println("------ MENU ------");
	           System.out.println("0. Cerrar el menú.");
	           System.out.println("1. Alta de usuario.");
	           System.out.println("------------------");
	           System.out.println("Elija una opción: ");
	           //Recojo la opción seleccionada por el usuario
	           byte opcion = sc.nextByte();
	           
	           //Entro en la opción seleccionada por el usuario
	           switch(opcion) {
	           case 0:
	        		   System.out.println("Entra en opción 0");
	           		   seCierra = true;
	           		   break;
	           case 1: 
	        		   System.out.println("Entro en opción 1");
	           		   break;
	           default:
	        		   System.out.println("La opción seleccionada no existe");
	           		   break;
	           }
	             
		}while(!seCierra);

        //Cierro el Scanner
        sc.close();

	}

}
