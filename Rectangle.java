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
        	for(int i=0;i<t;i++)
        	{
        	    int a = sc.nextInt();
        	    int b = sc.nextInt();
        	    int c = sc.nextInt();
        	    int d = sc.nextInt();
        	    if(a==b && c==d)
        	    {
        	        System.out.println("YES");
        	    }
        	    else if(b==c && a==d)
        	    {
        	        System.out.println("YES");
        	    }
        	    else if(a==c && b==d)
        	    {
	                System.out.println("YES");
        	    }
        	    else{
        	        System.out.println("NO");
        	    }
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
