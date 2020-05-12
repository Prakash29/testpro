

public class ThisTest
{
	int id ;
	String name;
	ThisTest(int id ,String name)
	{
		this.id=id;
		this.name=name;
	}
	
void display()

{
	System.out.println(id+""+name);
	
}

public static void main(String args[])

{
	ThisTest s1 =new ThisTest(1," prakash");
	ThisTest s2=new ThisTest(2," Viraj");
	s1.display();
	s2.display();

}

}
