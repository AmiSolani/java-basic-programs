
import java.lang.*;
import java.io.*;

public class re
{
	public static void main(String[] args) 
	{
		try
		{
		File f1=new File("demo1.txt");
		BufferedReader reader=new BufferedReader(new FileReader(f1));
		String str="",oldtxt="";

		while((str=reader.readLine())!= null)
		{
			oldtxt+=str +"\n";
		}

		reader.close();
		String newtxt=oldtxt.replace("word1","word2");
		FileWriter writer=new FileWriter("File2.txt");
		writer.write(newtxt);

		FileInputStream fis=new FileInputStream("File2.txt");
		{
			int i;
			while((i=fis.read())!=-1)
			{
			System.out.println(i);
		
			}
			fis.close();

		}
	}

		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}