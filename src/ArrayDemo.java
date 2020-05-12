
public class ArrayDemo {

	public static void main(String[] args) 
	{
		try
		{
			
		
     int a[]= new int [3];
     
     a[0]=1;
     a[1]=10;
     a[2]=200;
     
     for(int i=0;i<=a.length;i++)
{
    	 if(a[i]>=a[2])
    	 {
    		 System.out.println(a[i]);
    			continue ; 
    	 }
	System.out.println("number less than 3");
}  
		}catch (Exception e )
		{
			System.out.println("array out of box");
		}
	}

}
