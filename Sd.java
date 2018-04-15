class Sd 
{
 public static void main(String args[])
  {
  	StringBuffer sb= new StringBuffer("Thisisatest.");
	sb.delete(4,7);
	System.out.println("Afterdelete:"+sb);	
	sb.deleteCharAt(0);
	System.out.println("AfterdeleteCharAt:"+sb);
}
}


