/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{
		    Scanner sc  = new Scanner(System.in);
        	int t = sc.nextInt();
        	for(int i=0;i<t;i++)
        	{
        	    int a = sc.nextInt();
        	    int b = sc.nextInt();
        	    int count;
        	    int sum = a+b+1;
        	    for(count=2;count<sum;count++)
        	    {
        	        if(sum%count==0){
            	        sum++;
            	        count=2;
            	        continue;
        	        }
        	    }
        	    System.out.println(sum-(a+b));
        	}
		    
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
