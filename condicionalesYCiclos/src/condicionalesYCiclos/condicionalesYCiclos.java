package condicionalesYCiclos;
import java.util.Scanner;

public class condicionalesYCiclos {
	public static void main(String[] args) {
		
		System.out.println("Programa para calcular la hora");
		System.out.println("Agrega hora en formato de 24h");
		Scanner hora = new Scanner(System.in);
		
		int horaIn = hora.nextInt();
		
		if(horaIn>=0 && horaIn <=23) {	
			if(horaIn >= 0 && horaIn <=11){
				System.out.println("Buenos días solecito");
			}else if(horaIn>=12 && horaIn<=18) {
				System.out.println("Buenas tardes solecito");
			}else {
			System.out.println("Buenas noches");
			}
		
		} else {
			System.out.println("Hora mal ingresada");
		}
		
		
		hora.close();
	}
}
