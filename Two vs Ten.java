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
		    for(int i=0;i<t;i++){
		       int x=sc.nextInt();
		       if(x%10==0)
    		   {
    		       System.out.println("0");
    		   }
    		   else if (x%5==0)
    		   {
    		     System.out.println("1");   
    		   }
    		   else{
    		        System.out.println("-1");
    		   }
		    }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
