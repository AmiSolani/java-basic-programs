import java.util.*;

class Z
{

	public static void main(String args[])
	{
	int x,y,mul;	
	try
	{
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		mul=1;
       	System.out.println("value of x is:"+(x));
       	System.out.println("value of y is:"+(y));
       	for(int i=0;i<y;i++)
       	{
       	mul=mul*x;	
        }
        System.out.println("mal value is:"+mul);
    }
    catch(Exception e)
    {
    System.out.println("Exception:"+e);	
    }
    finally
    {
    	System.out.println("finally");
    }
	}


}