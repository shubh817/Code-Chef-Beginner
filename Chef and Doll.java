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
        	for(int i=0;i<t;i++)
        	{
        	    int n = sc.nextInt();
        	    int ar[] = new int[n];
        	    for(int j=0;j<n;j++)
        	    {
        	        ar[j]=sc.nextInt();
        	    }
        	    Arrays.sort(ar);
        	    for(int j=0;j<n;j=j+2)
        	    {
        	        //System.out.println(ar[j]);
        	        if(j==n-1)
        	        {
        	            System.out.println(ar[j]);
        	        }
        	        else if(ar[j]!=ar[j+1])
        	        {
        	            System.out.println(ar[j]);
        	            break;
        	        }
        	    }
        	}
		}
		catch(Exception e){
		    System.out.println(e);
		}
	}
}
