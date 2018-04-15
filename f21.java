import java.io.File;
class f21
{
 	static void p(String s)
 	{
 	System.out.println(s);
 	}
 	public static void main(String args[])
 	{
 	File f2=new File("demo.txt");
 	File f1  =new File(f2,"student.txt"); 
  	p("FileName:" + f1.getName());
  	p("Path:" + f1.getPath());
  	}
  
 }
