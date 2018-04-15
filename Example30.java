public class Example30
{
   public static void main(String args[])
   {  
         StringBuffer  str= new StringBuffer  ("This is a JAVA");
         str.setCharAt(10, 'E');
         System.out.println(str); 
         System.out.println(str.deleteCharAt(11));  
         System.out.println(str.delete(10,13));   
   }
} 