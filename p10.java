import java.io.*;

class p10
{
	public static void main(String[] args) throws Exception
	{
		File f1=new File(args[0]);
		if(!(f1.exists()))
		{
			System.out.println("file not exist");
			System.exit(0);
		}

		FileInputStream fis=new FileInputStream(args[0]);

			int i;
			int count=0;
			while((i=fis.read())!=-1)
			{
				if(i==53)
				{
				count++;
			
				System.out.println((char)i);	
				}
		
			}
			System.out.println(count);	
			fis.close();
	}
}