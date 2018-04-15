import java.util.*;

class S2
{
	public static void main(String args[])
	{
		//1
		String s1="amisolani";
		System.out.println("length is:"+s1.length());
		//2
		System.out.println("2nd char is:"+s1.charAt(2));
		//3
		String s="We are Atmiyians";
		int srcStart= 7;
		int srcEnd= s.length(); //16
		char target[]=new char[15];
		s.getChars(srcStart,srcEnd,target,0);
		System.out.println(target);
		//4
		byte b[]=s1.getBytes();
		for(int d=0;d<b.length;d++)
		{
 			System.out.println(b[d]);
		}
		//5
		char c[]= "abc".toCharArray();
		System.out.println(c[0]); 
		//6
		String s3="hello";
		s3.equals("hello"); //true
		s3.equals("HELLO"); //false
		s3.equalsIgnoreCase("HELLO"); //true 
		//7
		//syntax="string".regionMatches(int startIndex,String str2,int str2StartIndex,int numChars)
		"AtmiyaInstitute".regionMatches(0,"Atmiya",0,6); //true
		//8
		"Samsung".endsWith("sung"); // true
		"Samsung".startsWith("sam"); //true
		"Samsung".startsWith("ams",1); //true 
		//9
		int i= "atmiya".indexOf('a');
		System.out.println(i); //output : 0
		int i1= "atmiya".lastIndexOf('a');
		System.out.println(i1); //output : 5
		int i2= "madam".indexOf("mad");
		System.out.println(i2); //output : 0
		int i3= "madam".lastIndexOf("mad");
		System.out.println(i3); //output : 0
		int i4= "madam".indexOf("am",2);
		System.out.println(i4); //output : 3 
		//10
		String st= "AtmiyaInstitute".substring(2,6); //miya
		String str= "AtmiyaInstitute".substring(7); //Institute
		System.out.println(st);
		System.out.println(str);
		//11
		String s4 = "one";
		String s5 = s4.concat("two");
		System.out.println(s5);
		//12
		String s6 = "Hello".replace('l', 'w');
        System.out.println(s6);
        //13
        String s7= s1.trim();
        System.out.println(s7);
        //14
        String upper = "atmiya".toUpperCase(); // ATMIYA
		String lower = "ATMIYA".toLowerCase(); //atmiya
		


	}
}