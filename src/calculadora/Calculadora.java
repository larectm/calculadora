package calculadora;

public class Calculadora {
	public static int suma (int a, int b)
	{
		return a+b;
	}
	
	public static int resta (int a, int b)
	{
		return a-b;
		
	}
	
	public static void main (String arg [])
	{
		int a = 3, b = 2;
		int res = suma (a,b);
		int esperado =5;
		if(res== esperado)
		{
			System.out.println("Este programa esta bien hecho");
		}
		else {
			System.out.println("este programa esta mal echo");
			
		}
				
	}
}
