import java.net.*;
import java.io.*;

class ques5
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(8888);

		Socket s = ss.accept();

		System.out.println("connection done");

		DataInputStream br = new DataInputStream(s.getInputStream());

		DataOutputStream dos = new DataOutputStream(s.getOutputStream());

		int n = br.readInt();

		int a[] = new int[n];

		System.out.println("data is..");

		for (int i = 0; i<n ;i++ ) 
		{
			a[i] = br.readInt();

			System.out.println(a[i]);
		}

		for (int i=0; i < (n-1) ;i++ ) 
		{
			for (int j=0;j < (n-i-1) ;j++ ) 
			{
				int t;

				if(a[j] > a[j+1])
				{
				t = a[j];
				a[j] = a[j+1];
				a[j+1] = t;
			}

			}	
		}

		for (int i=0; i<n ;i++ ) 
		{
			dos.writeInt(a[i]);
		}

		s.close();

		ss.close();
	}
}