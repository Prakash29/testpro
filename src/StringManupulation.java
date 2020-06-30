

public class StringManupulation {

	public static void main(String[] args)
	{

     try {
		String s1="Prakash";
		 String s2="Sonawane";

			System.out.println(s1.equals("Prakash"));
			System.out.println(s1.equals("pms"));
			System.out.println(s1.contains("k"));
			System.out.println(s1.toLowerCase());
			System.out.println(s1.toUpperCase());
			System.out.println(s1.concat("sonawane"));
			System.out.println(s1.charAt(0));
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
	} catch (Exception e) {
		
		e.printStackTrace();
		
		System.out.println(e.getMessage());
	}
		
		

	}

}
