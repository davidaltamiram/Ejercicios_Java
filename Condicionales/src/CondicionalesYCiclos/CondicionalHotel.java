package CondicionalesYCiclos;

import java.util.Scanner;

public class CondicionalHotel {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pagos();
		factura();

	}
	
	
	//Condicionales Hotel
	public static void Pagos() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Seleccione el tipo de pago \n 1.Tarjeta \n 2.Efectivo");

	int tipoPago = scanner.nextInt();

	if (tipoPago == 1) {
		System.out.println("Seleccione el tipo de tarjeta \n 1.Débito \n 2.Credito");
		int tipoTarjeta = scanner.nextInt();
		if (tipoTarjeta == 1) {
			System.out.println("Se pagará con débito");
		} else if (tipoTarjeta == 2) {
			System.out.println("Seleccione los MSI \n 1. 3 MSI \n 2.6 MSI \n 3.12 MSI");
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
	
	
		public static void factura() {
			Scanner input = new Scanner(System.in);
			System.out.println("Necesit factura \n 1.- SI \n 2.- NO ");
			
			int factura = input.nextInt();
			
			if(factura == 1){
				System.out.println("Ingrese los datos solicitidados \n");
			
				System.out.println("Ingrese su correo: \n");
				String correo = input.next();
				
				System.out.println("Ingrese su RFC: \n");
				String rfc = input.next();
				
				System.out.println("Ingrese su domicilio fiscal: \n");
				String domicilio = input.next();
				
				System.out.println("Ingrese su nombre fiscal: \n");
				String nombre_fiscal = input.next();
			
				System.out.println("Se enviara su factura por correo");
				
			}else if(factura == 2) {
				System.out.println("Execelente Dia!!..");
			}else {
				System.out.println("No ingreso un dato valido valido");
			}
			
		
		}	
			
		
}
