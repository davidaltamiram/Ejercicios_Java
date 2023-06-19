package entidades;

public class Persona {

	// 1. Propiedades o atributos
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;

	// 2. Constructor
	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;

	}// Cierre de constructor

	// Sobrecarga de método overloading
	public Persona(String nombre, int edad, String correo) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
	}
		
		//Sobrecarga de método overloading
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;

	}// Cierre de constructor

	// 3. Métodos
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Telefóno: " + telefono);
	}// Cierre mostrar información

	// Método main una función ejecutora

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona Felipe = new Persona("Felipe", 31, "felipe.maqueda@idr.edu.mx", "5512345678");

		// Clase, nombre variable, palabra reservada instancia, nombre metodo
		// constructor, parametros del constructor
		Felipe.mostrarInformacion();

		Persona Anyi = new Persona("Anyi", 29, "carbono12.011@gmail.com", "3320474072");
		Anyi.mostrarInformacion();

		Persona Selena = new Persona("Selena", 28, "moxita@gmail.com", "3323476318");
		Selena.mostrarInformacion();

		Persona Carlos = new Persona("Carlos", 45, "señor@gmail.com", "3327874010");
		Carlos.mostrarInformacion();

		Persona Fer = new Persona("Fernanda", 29, "fer@gmail.com", "3327584010");
		Fer.mostrarInformacion();
		
		Persona Sara = new Persona("Sara", 29, "3327584010");
		Sara.mostrarInformacion();

	}// Cierre del main

}// Cierre de clase persona
