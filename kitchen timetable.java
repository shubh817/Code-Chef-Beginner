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
        	for(int k=1;k<=t;k++)
        	{
                int n = sc.nextInt();
        		int count = 0;
        		int a[] = new int[10011];
        		for (int i = 1; i <= n; i++) {
        			a[i] = sc.nextInt();
        		}
        		for (int i = 1; i <= n; i++) {
        			int b = sc.nextInt();
        			if (a[i] - a[i - 1] >= b)
        				count++;
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
