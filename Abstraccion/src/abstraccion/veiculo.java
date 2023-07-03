package abstraccion;

public abstract class veiculo {
//26/junio/2023
	//Atributo
	public String marca;
	public int anio;
	
	//Metodo concreto
	public void mostrarInfo() {
	}{
		System.out.println( "Mi auto es: " + marca + "y es del anio: " + anio );
		
	}//mostrar info

	//;Metodo abstracto 
	public abstract void acelerar();
	
	//Metodo abstracto
	public abstract void frenar();
	
	
	
}


/*
Abstraccion

En Java, una clase abstracta es una clase que no puede ser implementada directamente (que no puede instanciar), si no que se utiliza como una base para crear subclases mas concretas. Se utiliza para definir una estructura comun y compartir el comportamiento entre las subclases relacionadas.

Una clase abstracta puede implememtnar metodos concretos (metodos que hemos utilizado hasta ahorita ) y metodos abstractos.
*/