
public class OverloadingDemo 
{
	public int add(int a, int b) 
	{
		return a + b;
	}

	public double add(double c, double d)
	{
		return c + d;
	}
	
	public static void main(String[] args) 
	
	{

		OverloadingDemo obj = new OverloadingDemo();

		System.out.println(obj.add(19, 20));

		System.out.println(obj.add(10.5, 20.5));
	 }

}
