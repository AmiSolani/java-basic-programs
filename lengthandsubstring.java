import java.util.*;
class convertion 
{
	public static void main(String []args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a string: \n");
		String s1=new String();
		s1=ip.nextLine();
		System.out.println(s1.length());
		int l=s1.length();
		System.out.println(s1.substring(l/2));
	}
}