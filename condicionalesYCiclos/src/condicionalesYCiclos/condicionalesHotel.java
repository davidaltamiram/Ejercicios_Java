package condicionalesYCiclos;

import java.util.Scanner;

public class condicionalesHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 1;

		switch (opcion) {
		case 1:
			System.out.println("Bienvenido al sistema de reservas");

		case 2:
			System.out.println("Bienvenido al sistema de checkin");

		case 3:
			System.out.println("Bienvenido al sistema de check-out");

		default:
			System.out.println("opcion invalida");
			break;
		}
	}

	// Este método determina el tipo de pago a realizar
	public static void metodosDePago() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seleccione el tipo de pago/n 1.Tarjeta /n 2.Efectivo");

		int tipoPago = scanner.nextInt();

		if (tipoPago == 1) {
			System.out.println("Seleccione el tipo de tarjeta/n 1.Débito /n 2.Credito");
			int tipoTarjeta = scanner.nextInt();
			if (tipoTarjeta == 1) {
				System.out.println("Se pagará con débito");
			} else if (tipoTarjeta == 2) {
				System.out.println("Seleccione los MSI/n 1. 3 MSI /n 2.6 MSI /n 3.12 MSI");
				int msi = scanner.nextInt();
				if (msi == 1) {
					System.out.println("Su pago sera a 3 meses sin intereses");
				} else if (msi == 2) {
					System.out.println("Su pago sera a 6 meses sin intereses");
				} else if (msi == 3) {
					System.out.println("Su pago sera a 12 meses sin intereses");
				} else {
					System.out.println("Seleccione una opción valida");
				}
			} else {
				System.out.println("Seleccione una opción valida");
			}
		} else if (tipoPago == 2) {
			System.out.println("Se pagará con efectivo");
		} else {
			System.out.println("Seleccione una opción valida");
		}
		scanner.close();
	}

	// Este método pregunta al usuario si requiere una habitación para fumadores
	public static Boolean areaFumadores() {
		Scanner fumar = new Scanner(System.in);
		System.out.println("Requieres una habitación de fumador");
		String respuesta = fumar.nextLine();

		if (respuesta == "si") {
			System.out.println("Se te asignara una habitación especial, se te cobrará un cargo adicional");
			fumar.close();
			return true;

		} else {
			System.out.println("Bienvenido a Hotel Gene");
			fumar.close();
			return false;
		}
	}

	// Este método calcula cargos extra si el usuario es fumador
	public static void cargosAdicionales() {
		Boolean esFumador = areaFumadores();

		if (esFumador == true) {
			System.out.println("Se le aplicara un cargo de $500 pesos");
		} else {
			System.out.println("Sin cargos extra para ti");
		}

	}

	// Este método se encarga de verificar si el usuario tiene un cupon de descuento
	// activo
	public static void DescuentosYPromociones() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("¿Tienes un código de descuento?");

		Boolean codigo = scanner.hasNextBoolean();

		if (codigo == true) {
			System.out.println("Tienes un descuento del 30%");
		} else {
			System.out.println("Cupón invalido. Se cobrara el precio total");
		}
		scanner.close();
	}
}
