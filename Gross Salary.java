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
        	int t = sc.nextInt(); //testcase
        	for(int i=0;i<t;i++)
        	{
        	    float salary = sc.nextInt();
        	    if(salary<1500)
        	    {
        	        float hra = (salary*10)/100;
        	        float da = (salary*90)/100;
        	        float gross = salary+hra+da;
        	        System.out.format("%.2f",gross);
        	        System.out.println();
        	    }
        	    else
        	    {
        	        float hra = 500;
        	        float da = (salary*98)/100;
        	        float gross = salary+hra+da;
        	        System.out.format("%.2f",gross);
        	        System.out.println();
        	    }
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
