import java.net.*;
import java.io.*;

class Inetdemo
{
	
	public static void main(String[] args)
	{
		try
		{
		InetAddress ip= InetAddress.getByName("www.javatpoint.com");
		System.out.println("host name"+ip.getHostName());
		System.out.println("ip address"+ip.getHostAddress());	
		}
	
	 catch(Exception e)
	 {
	 	System.out.println(e);
	 }
	}
}
