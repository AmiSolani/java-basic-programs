import java.util.*;
class Stream
{
	public static void main(String []args)
	{
		char c[]={'S','T','R','E','A','M'};

		for(int i=0;i<6;i++)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");

			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(" "+c[k]);
			}
			System.out.print("\n");

		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i+1;j++)
			{
				System.out.print(" ");

			}
			for(int k=5;k>i;k--)
			{
				System.out.print(" "+c[k]);
			}
			System.out.print("\n");

		}

		


	}
}