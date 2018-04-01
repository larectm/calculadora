package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
@Test 
public void testSum()
{
	Calculadora calc = new Calculadora ();
			int resul = calc.add(3,2 );
			int esper = 5;
			assertEquals(esper,resul);
			
	}
public void testanssuma()
{
	Calculadora calc = new Calculadora ();
	calc.add(3, 2);
	int resul = calc.ans() ;
	int esper= 5;
	assertEquals(esper, resul);
	}
}
