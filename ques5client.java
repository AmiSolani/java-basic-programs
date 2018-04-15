import java.net.*;
import java.io.*;
import java.util.*;

class ques5client
{
	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("localhost",8888);

		//BufferedReader kb = new BufferedReader(new InputStream(System.in));

		DataOutputStream dos = new DataOutputStream(s.getOutputStream());

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of element");

		int n = Integer.parseInt(args[0]);

		int a[] = new int[n];

		dos.writeInt(n);

		for (int i =0; i < n ;i++ ) 
		{
			int h = sc.nextInt();

			dos.writeInt(h);
		}

		DataInputStream dis = new DataInputStream(s.getInputStream());

		System.out.println("Sorted data are");

		int h;

		for (int i=0;i < n ;i++ ) 
		{
			h = dis.readInt();

			System.out.println(h + "\n");
		}

		s.close();

	}
}