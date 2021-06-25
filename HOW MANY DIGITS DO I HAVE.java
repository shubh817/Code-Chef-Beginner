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
        	int n = sc.nextInt();
        	if(n<10){
        	    System.out.println("1");
        	}
        	else if(n>=10 && n<100){
        	    System.out.println("2");
        	}
        	else if(n>=100 && n<1000)
        	{
        	    System.out.println("3");
        	}
        	else
        	{
        	    System.out.println("More than 3 digits");
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
