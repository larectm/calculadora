package calculadora;

public class Calculadora {
	private int ans;
	
	{
		ans=0;
		
	}
	
	public int add (int a, int b)
	{
		ans = a+b;
		return ans;
	}
	public int sub	(int a, int b)
	{
		ans = a-b;
		return ans;				
	}
	public int add (int v)
	{
		ans += v;
		return ans;
	}
	public int sub(int v)
	{
		ans -=v;
		return ans;
	}
	public int ans()
	{
		return ans;
	}
	public void clear ()
	{
		ans=0;
	}
	public int div (int a , int b)
	{
		if(b==0)
		{
			throw new ArithmeticException("no puedes dividir por cero!!");
		}
		ans = a  / b;
		return ans; 
	}
}
