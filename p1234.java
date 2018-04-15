import java.io.*;
import java.util.*;

 class p1234 {

    public static void main(String[] args) {
    	int i,j,k;

    	 for (i=1;i<=3 ;i++ ) {

    		for (j=1;j<=3 ;j++) {

                    if(i==1 ||  i==3 || j==1 || j==3)
                    {
    				System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
  
    		}

    		System.out.println();

       	}
    }
}