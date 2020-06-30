

import java.util.Scanner;

public class RevStr1 {

	public static void main(String[] args) 
	{
		
		String str="Prakash";
		String str1="PMS";
		
StringBuilder sb=new StringBuilder(str);
StringBuffer sb1=new StringBuffer(str1);

System.out.println(sb.reverse().toString());
System.out.println(sb1.reverse().toString());


/*System.out.println("Enter string to reverse:");

Scanner read = new Scanner(System.in);
String str1 = read.nextLine();
*/
	}

}
