public class equal11
	{
	 public static void main(String args[])
	 { 
	 String str1 = new String("Hello, How are you");
	 String str2 = new String("How");
	 System.out.print("Result of Test1: " );
	 System.out.println(str1.regionMatches(7, str2, 0, 3));
	 }
	} 