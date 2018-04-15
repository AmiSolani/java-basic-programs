public class Example11
{
   public static void main(String args[])
   {
           String s1="this is index of example";  //passing substring 
           int index1=s1.indexOf("is");          //returns the index of is substring 
           int index2=s1.indexOf("index");		//returns the index of index subst ring
           System.out.println(index1+"  "+index2);  
           int index3=s1.lastIndexOf("is");  
           System.out.println(index3); 
    }
} 