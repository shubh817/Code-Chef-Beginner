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
        	for(int j=0;j<t;j++)
        	{
        	    int a[] = new int[10];
        	    for(int i =0 ; i< 10; i++)
        	    {
        	        a[i] = sc.nextInt();
        	    }
        	    int k = sc.nextInt();
        	    for(int i = 9 ; i >=0;i--)
        	    {
        	        if(a[i]>k)
                    {
                        System.out.println(i+1);
                        break;
                    }
        	        else
        	        k -= a[i];
        	    }
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
