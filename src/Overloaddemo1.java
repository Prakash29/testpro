
public class Overloaddemo1
{
	public int sum(int a, int b)
	{
		return a+b;
		
	}
	
	public double sum (double c,double d)
	{
	
		return  c+d;
		
	}

	public static void main(String[] args)
	{
		Overloaddemo1 ob=new Overloaddemo1();
		
	System.out.println(ob.sum(10, 20));	
		
		System.out.println(ob.sum(10.10, 20.15));
		
		
		
	}

}
