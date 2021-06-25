/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    Scanner sc  = new Scanner(System.in);
        	int t = sc.nextInt();
        	for(int i=0;i<t;i++)
        	{
        	    int n = sc.nextInt();
        	    long ar[] = new long[n];
        	    for(int j=0;j<n;j++)
        	    {
        	        ar[j]=sc.nextInt();
        	    }
        	    for(int j=0;j<n-1;j++)
        	    {
        	        if(ar[0]>ar[j+1])
        	        {
        	            ar[0]=ar[j+1];
        	        }
        	    }
        	    System.out.println(ar[0]*(n-1));
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
