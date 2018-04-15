/* here, two way communication between client and server and here client asking 
for some file from server and server send that file to client.*/

import java.io.*;
import java.net.*;

class fileclient 
{
	public static void main(String[] args) throws Exception
	{
			//create socket for client side.
			Socket s = new Socket("localhost",8888);

			/* now, here client request for file and input takes from keyboard.
			so we required System.in and input is in text so for convert that 
			InputStreamReader and store that input we requires BufferedReader */

			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

			//take filename from input. we have object for taking input is kb.

			System.out.println("enter file name");
			String fname = kb.readLine();

			/* for sending file name we have getOutputStream Method. for that we requires
			one OutputStream class. so, for that we take DataOutputStream class.
			and for sending a data output we have to use method writeBytes().*/

			DataOutputStream out = new DataOutputStream(s.getOutputStream());

			out.writeBytes(fname + "\n");

			/* now, server finds file which is requested by client. and send that file.
			for read that file, we have to use getInputStram method, for that we 
			required InputStreamReader class and for store that data we required
			BufferedReader Class.*/

			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

			String str;
			str = in.readLine(); //read first line from the server.

			if (str.equals("yes")) 
			{
				while ((str=in.readLine()) != null) 
				{
				System.out.println(str);
				
					
				}
				in.close();
				out.close();
				kb.close();
				s.close();				
			}

			else 
			{
				System.out.println("file not found");
			}
	}	
}