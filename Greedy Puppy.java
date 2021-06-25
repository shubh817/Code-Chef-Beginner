/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try
		{
    		Scanner sc = new Scanner(System.in);
        	int t = sc.nextInt();
        	for(int i=0;i<t;i++){
        	    int n = sc.nextInt();//coins
        	    int k = sc.nextInt();//people
        	    int max=0;
            	for(int j=1;j<=k;j++){
            	    int r = n%j;
            	    if(r>max)
            	    {
            	        max=r;
            	    }
            	}
            	System.out.println(max);
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
