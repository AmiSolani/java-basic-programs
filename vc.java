import java.util.*;
class Vc
{

	public static void main(String []args)
	{
	int v=0,con=0,c;
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter Line");
	String s=new String();
	s=ip.nextLine();
	
	for(int i=0;i<s.length();i++)
	{

			if(s.charAt(i)=='a'  || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
			{
				v++;
			}
			else
			{
				con++;
			}
	}
		System.out.println("No of Vowels are"+v);
		System.out.println("No of conson are"+con);
	}
}