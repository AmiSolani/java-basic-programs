class sem5
{
	public static void main(String args[])
	{
		try
		{
			int a[]={1,2,3};
			a[5]=10;
		}
		catch(ArrayIndexOutOfBoundException e)
		{
			System.out.println(e);
		}

		finally
		{
			System.out.println("finally block");	
		}

		try
		{
			method();
		}

		catch(Exception e)
		{
			System.out.println("no such method ");
		}
	}

		static void method() throws Exception
		{
			throw new Exception("Exception");
		}

			
}