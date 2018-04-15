public class Example12
{
   public static void main(String args[])
   {
          String str= new String("quick brown fox jumps over the lazy dog");
          System.out.println("Substring starting from index 15:");
          System.out.println(str.substring(15));
          String str1="Hello";
          System.out.println(str1.replace('o', 'p'));
          String str2=str1.concat(str);
          System.out.println(str2);
          String str3 = new String("    How are you??   ");
          System.out.println("String after trim: "+str3.trim());  
      	  System.out.println("String uppercase: "+str3.toUpperCase());
      	  System.out.println("String lowercase: "+str3.toLowerCase());         
	}  
}   