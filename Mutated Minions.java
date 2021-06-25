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
        	for(int i=0;i<t;i++){
        	    int n = sc.nextInt();
        	    int k = sc.nextInt();
        	    int count=0;
        	    for(int j=0;j<n;j++)
        	    {
        	        int a  = sc.nextInt();
        	        if((a+k)%7==0)
        	        {
        	            count++;
        	        }
        	    }
        	    System.out.println(count);
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
