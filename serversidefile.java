import java.io.*;
import java.net.*;

class fileserver
{
	public static void main(String[] args) throws Exception
	{
		
		//first create server side socket

		ServerSocket ss = new ServerSocket(8888);

		//serversocket recevies request, and its return value is Socket class itself

		Socket s = ss.accept();
		System.out.println("Connection Established");
		
		/*client pass the filename to server. server accepts input from clientside.
		 so here getInputStream method is used. it is in byte form so you have one InputStreamReader.
		 and for store that text we have to take Buffered Reader.*/

		 BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

		 /* now, file is in object br. and now server checks for file which is requested by 
		 client. And for sending that file it requires some getOutputStream method and 
		 it is in form of data so DataOutputStream. */

		 DataOutputStream dos = new DataOutputStream(s.getOutputStream());

		 /*here for receving data br object and for sending data dos object. here in br filename
		 is there but server have to read that file. so read thet filename method is readLine
		 and return type is string.*/

		 String fname = br.readLine();

		FileReader fr = null;
		BufferedReader file = null;
		boolean flag; //flag for file is exsist or not.

		 File f = new File(fname); //create file class object for file name

		 //check file is exsist or not

		 if(f.exists())
		 {
		 	flag = true;
		 }
		 else 
		 {
		 	flag = false;
		 }

		 if (flag==true) 
		 {
		 	dos.writeBytes("yes" + "\n");
		 }

		 else
		 	dos.writeBytes("no" + "\n");

		 /* if file is exsist then take FileReader for read file. and then attach it
		 to BufferedReader */

		 if (flag==true) 
		 {
			 fr = new FileReader(fname);
     
			//attach FileReader to BufferedReader
			file = new BufferedReader(fr);

			 String str;

			 // write file. for sending and writing purpose we have object dos.

			 while ((str=file.readLine())!=null) 
			 {
			 	dos.writeBytes(str + "\n");
			 }

			 file.close();
			 //f.close();
			 br.close();
			 dos.close();
			 s.close();
			 ss.close();
		}
	}
}