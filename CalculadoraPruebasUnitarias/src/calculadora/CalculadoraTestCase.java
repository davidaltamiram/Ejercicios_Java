package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CalculadoraTestCase {

	@Test
	void test() {
		int resultado = Calculadora.sumar(2,3);
		//Para esta prueba espero que la suma me de 5 (3+2)
		assertEquals(5, resultado); //Lo que espero y lo que tengo
	}//testSumar
	
	
	@Test
	void testMultiplicar() {
		int resultado = Calculadora.multiplicar(2,3);
		assertEquals(6, resultado); //lo que espero y lo que tengo;
	} //TestMultiplicar

//	@Test (expected = ArithmeticException.class)
//	void testDividir() {
//		float resultado = Calculadora.dividir(6.0f, 0.0f);
//		assertEquals(dividendo, divisor); //lo que espero y lo que tengo
//	}//testdividir
}
