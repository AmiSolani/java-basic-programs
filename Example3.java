public class Example3
{ 
  public static void main(String args[])
  {
   StringBuffer  str= new StringBuffer  ("This is a JAVA");
   System.out.println("String length"+str.length());
   System.out.println("String capacity"+str.capacity());
   str.setLength(4);   
   System.out.println("String after length 4"+str); 
   }
} 