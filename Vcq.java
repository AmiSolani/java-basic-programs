// Program to find Number of VOWELS, WORDS and Sentence.
import java.util.*;
class Vcq
{
	public static void main(String args[])
	{
		int i,v=0,w=1,s1=0;
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Sentence");
		String s=new String();
		s=ip.nextLine();
	

		for(i=0;i<s.length();i++)
		{

			if(s.charAt(i)=='a'  || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
			{
				v++;
			}
			if(s.charAt(i)==' ')
			{
				w++;
			}
			if(s.charAt(i)=='.')
			{
				s1++;
			}
		}
		System.out.println("Number of Vowels are: "+v);
		System.out.println("Number of Words are: "+w);
		System.out.println("Number of Sentences are: "+s1);
	}
}