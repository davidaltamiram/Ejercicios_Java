package abstraccion;

public class testAbstraccion {
//26/junio/2023
	
	public static void main(String[] args) {
		
		//Instancia de la clase automovil
		automovil myTroquita = new automovil();
		
		//Instancia de la clase motocicleta 
		Motocicleta ninja = new Motocicleta();
		

		
		//Llamamos a los metodos de cada instancia 
		myTroquita.acelerar();
		ninja.acelerar();
		
		myTroquita.frenar();
		ninja.frenar();
		
	}

}
