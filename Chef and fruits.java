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
		    Scanner sc = new Scanner(System.in);
        	int t = sc.nextInt();
        	for(int i=0;i<t;i++)
        	{
        	    int n = sc.nextInt();//apples     5
        	    int m = sc.nextInt();//oranges    2
        	    int k = sc.nextInt();//chances    1
        	    int min = Math.abs(m-n);          //3
        	    min=min-k;                        //3-1=2
        	    if(min<=0)
        	    {
        	        min=0;
        	    }
        	    System.out.println(min);
        	    
        	}
		} 
		catch(Exception e) {
		    System.out.println(e);
		}
	}
}
