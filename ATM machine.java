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
		    Scanner sc = new Scanner(System.in);
        	int t = sc.nextInt();
        	for(int k=1;k<=t;k++)
        	{
        	    int n = sc.nextInt();
        	    int m = sc.nextInt();
        	    int a[]=new int[1000000];
        	    for(int i=1;i<=n;i++)
        	    {
        	        a[i]=sc.nextInt();
        	    }
        	    for(int i=1;i<=n;i++)
        	    {
        	        int d = m-a[i];
        	        if(d>=0)
        	        {
        	            System.out.print("1");
        	            m=d;
        	        }
        	        else
        	        {
        	            System.out.print("0");
        	        }
        	        //
        	    }
        	    System.out.println();
            }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		} 
		
	}
}
