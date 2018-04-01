package calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class CalculadoraTest {
	Calculadora calc ;

	
@Before	
public void before ()
{
	System.out.println("before()");
	calc = new Calculadora();
}
@After
public void after ()
{
	System.out.println("after()");
	calc.clear();
}
@Test 
public void testSum()
{
	System.out.println("sum()");
	int resul = calc.add(3,2 );
	int esper = 5;
	assertEquals(esper,resul);
			
}
@Test
public void testanssuma()
{
	System.out.println("andsum()");
	calc.add(3, 2);
	int resul = calc.ans() ;
	int esper= 5;
	assertEquals(esper, resul);
	}
@Test
public void testDiv()
{
	System.out.println("div () ");
	calc.div(5,2);
}
@Test(expected = ArithmeticException.class)
public void testDivPorCero() {
	System.out.println("div () cone exception");
	calc.div(5, 0);
}
//timeout controla el tiempo "detiene los siclos infinitos"

}
