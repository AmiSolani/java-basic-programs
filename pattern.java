import java.util.Scanner;
class demo
{
	public static void main(String args[])
	{

 	System.out.println("Enter the value of n:");
 	Scanner ip=new Scanner(System.in);
 	int n=ip.nextInt();

 	for(int i=0;i<=n;i++)
 	{
  		for(int j=1;j<i;j++)
  		{
         	if((i+j)%2==0)
         	{
    		System.out.print("0");
        	}
   		else
   		{
    		System.out.print("1");
   		}
  		}

    	System.out.println(" ");

 	}
 	
	}
}