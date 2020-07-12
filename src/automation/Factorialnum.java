package automation;

public class Factorialnum {

	public static void main(String[] args) {
	
		int fact=1;
		int i,num=6;
		
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
