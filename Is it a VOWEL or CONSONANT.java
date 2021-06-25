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
        	char c1 = sc.next().charAt(0);
        	if(c1=='A' || c1=='E' || c1=='I' || c1=='O' || c1=='U')
        	{
        	    System.out.println("Vowel");
        	}
        	else
        	{
        	    System.out.println("Consonant");
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
