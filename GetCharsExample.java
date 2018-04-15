public class GetCharsExample
{    
public static void main(String args[])
	{        
		String str = new String("This is a String Handling Tutorial");
		char[] array = new char[6]; 
		str.getChars(10, 16, array, 0);  
		System.out.println("Array Content:" ); 
		for(char temp: array)
		{  
		System.out.print(temp); 
		}
	}
}
