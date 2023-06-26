package entidades;

public class Persona {
	
	//1. Propiedades o atributos
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;
	
	//2. Contructor (con parametros)
	
	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	}
	
	//3. Metodos
	
	public void mostrarInformacion() {
		System.out.println("Nombre: "+ nombre);
		System.out.println("Edad: "+ edad);
		System.out.println("Correo: "+ correo);
		System.out.println("Telefono: "+ telefono);
	}
	
	
	public static void main(String[] args) {
		Persona Felipe = new Persona("Felipe",31,"as","56487958");
		Persona Koala = new Persona("Koala",16,"koala@gmail.com","56231523");
		Persona Luis = new Persona("Luis", 28, "luis@gmail.com","52123256");
		
		Felipe.mostrarInformacion();
		Koala.mostrarInformacion();
	}
	
	
}
