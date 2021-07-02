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
        	int n=sc.nextInt();
        	int count=0;
        	for(int i=1;i<10;i++)
        	{
        	    if(n%i==0)
        	    {
        	        count=i;
        	    }
        	}
        	System.out.println(count);
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
