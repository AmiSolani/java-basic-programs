class res
{
	public static void main(String[] args) 
	{
		String s=args[0];
		char b[]=s.toCharArray();
		for (int i=(b.length-1);i>=0 ;i-- ) 
			{
			System.out.println(b[i]);	
			}	
	}
}