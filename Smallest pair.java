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
        	int t = sc.nextInt(); //testcase
        	for(int i=0;i<t;i++)
        	{
        	    int n = sc.nextInt();
        	    int ar[] = new int[n];
        	    int sum=0;
        	    for(int j=0;j<n;j++)
        	    {
        	        ar[j]=sc.nextInt();
        	    }
        	    Arrays.sort(ar);
        	    sum=ar[0]+ar[1];
        	    System.out.println(sum);
        	}
		} 
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
