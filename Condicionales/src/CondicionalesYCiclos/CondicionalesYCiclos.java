package CondicionalesYCiclos;
import java.util.Scanner;
public class CondicionalesYCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*final int edad = 31; //que esta variable es constante, ya tiene un valor final
		
		
		System.out.println("La edad es: " + edad);*/
		
		
		/*
		 * Condicionales
		 * 
		 * if
		 * else
		 * if else
		 * switch
		 * 
		 * 
		 */
		
		System.out.println("Programa para calcular la hora");
		
		//Equivalente al prompt en JS se llama scanner
		
		//var hora = prompt("mensaje");
		
		//Nenito = new Gatito (parametros);
		
		//Java, crea un nuevo objeto Scanner, llamalo hora y este será un nuevo objeto de la clase Scanner, que tiene los argumentos para guardar la información que le pasé coo entrada
		

		Scanner valorIngresado = new Scanner(System.in);
		
		System.out.println("por favor, ingresa una hora en un formato de 24 horas");
		
		//var valorIngresado = prompt("mensaje"); en una sola línea declaro variable, asigno el prompt, y la info del prompt la guardo en esa variable.
		
		int hora = valorIngresado.nextInt();
		
		
		//int hora = 13;//Declaramos una variable
		
		if(hora >= 7 && hora <=23) { //true
			System.out.println("Hora ingresada correctamente");
			if(hora>= 0 && hora <=11) {
				System.out.println("Buenos días solecito, la tierra les dice hola");
			}else if (hora >=12 && hora <=18) {
			System.out.println("Buenas tardes, que calor hace");
			
		}else if (hora>= 19 && hora <24) {
			System.out.println("Buenas noches, a mimir");
		}else {
			System.out.println("Es de madrugada, no es bueno desvelarse");
		}

	}else {
		System.out.println("Hora mal  ingresada");
	}
valorIngresado.close();

		/*Condicinal switch*/
		int opcion =1;
		switch (opcion) {
		    case 1:
			System.out.println("Bienvenido al servicio de reservas");
			break;
			//Lógica de negocio para la función de las reservas
			
		     case 2: System.out.println("Bienvenido al servicio de check-in");
		     break;
		     
		     case 3:
		    	 System.out.println("Bienvenido al servicio de checkout");
		    	 break;
		    	 
		    	 default:
		    		 System.out.println("Opcion invalida");

		}//Cierre del switch
		
		//Ejemplo del switch anidado
		
//		int entradaDeDato = 5;
//		int otraOpcion = 1;
//		
//		switch(entradaDeDato) {
//		case 1:
//			switch(otraOpcion) {
//			case 1: System.out.println("Esta es la primera opción del primer caso");
//			break;
//			case 2; System.out.println("Esta es la segunda opción del primer caso");
//			break;
//			default:
//				System.out.println("Opción invalida");
			}//Cierre del switch interno
		}//Cierre del switch general
		
	}//Cierre del método main
}//Cierre de la clase condicionales
