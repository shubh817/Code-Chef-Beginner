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
		    Scanner sc  = new Scanner(System.in);
        	int t = sc.nextInt();
        	for(int i=0;i<t;i++)
        	{
        	    String str = sc.next();
        	    int count=0,count1=0;
        	    for(int j=0;j<str.length();j++)
        	    {
        	        if(str.charAt(j)=='a')
        	        {
        	            count++;
        	        }
        	        else
        	        {
        	            count1++;
        	        }
        	    }
        	    if(count>count1)
        	    {
        	        System.out.println(count1);
        	    }
        	    else
        	    {
        	        System.out.println(count);
        	    }
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
		
	}
}
