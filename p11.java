import java.io.*;

class p11
{
	public static void main(String[] args) throws Exception
	{
		String dir=args[0];
		File f1=new File(dir);

		if(f1.isFile())
		{
			System.out.println("File sizes:"+f1.length()+"Bytes");
		}

		else if(f1.isDirectory())
		{
			System.out.println("Directory"+dir);
			String a[]=f1.list();
			for (int i=0;i<a.length ;i++ ) 
			{
				File f=new File(dir+"/"+a[i]);
				if(f.isDirectory())	
				{
				System.out.println(a[i]+"is Directory");
				}
				else
				{
					System.out.println(a[i]+"is a file.");
				}
			}
		}
	}
}
