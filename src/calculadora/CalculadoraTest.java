package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
@Test
 public void testsuma()
 {
	 int resultado = Calculadora.suma(2,3);
	 int esperado = 5;
	 assertEquals(esperado, resultado);
 }
@Test
 public void testresta()
 {
	int resultado = Calculadora.resta(3, 2);
	int esperado = 1;
	assertEquals(esperado,resultado);
 }
}
