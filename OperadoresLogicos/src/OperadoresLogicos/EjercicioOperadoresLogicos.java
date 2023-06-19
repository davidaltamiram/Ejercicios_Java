package OperadoresLogicos;
import java.util.Scanner;


public class EjercicioOperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Ingresa el primer numero:");
		int num1 = sc.nextInt();
		System.out.println("Ingresa el segundo numero");
		int num2 = sc.nextInt();
		
		if (num1%2==0 && num2%2==0) {
			System.out.println("Los numeros son pares");
		} else if(num1%2==0 && num2%2==1){
			System.out.println("El primer numero es par");
		} else if(num1%2==1 && num2%2==0){
			System.out.println("El segundo numero es par");
		} else {
			System.out.println("Los numeros son impares");
		}
		
		sc.close();
		/*Los operadores logicos se utilizan para combinar valores
		 *  booleanos y nos devuelve un verdadero, falso}
		 *  
		 *  - && and (Y)
		 *  - || or (o)
		 *  - ! not (no)
		 *  
		 *  
		 *  	
		int a = 5;
		int b = 3;
		
		System.out.println(a == b || a > b);	
		 *  
		 *  
		 *  */
		
	}
	
	
	
	
	

}
