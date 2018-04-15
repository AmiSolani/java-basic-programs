import java.io.*;
import java.util.*;

 class p2  {

    public static void main(String[] args) {
    	int i,k;

    	 for (i=1;i<=5;i++ ) {

    	 	 for(k=1;k<=5-i;k++)
    	 	 {
    	 	 	System.out.print(" ");
    	 	 }

    		for (int j=1;j<=i ;j++) 
			{
    			System.out.print(j);
    			}
    		
    			System.out.println();
    		}	
    
    }
}