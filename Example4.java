public class Example4
{ 
  public static void main(String args[])
  {
          StringBuffer  str= new StringBuffer  ("This is a JAVA");
          System.out.println("reverse String is"+str.reverse());
          StringBuffer sb= new StringBuffer("This is a test.");
          sb.replace(5, 7, "was"); 
          System.out.println("After  replace: " + sb);
   }
} 