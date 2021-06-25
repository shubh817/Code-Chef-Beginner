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
        	     int hard = sc.nextInt();
        	     float carbon = sc.nextFloat();
        	     int tensile = sc.nextInt();
        	     
        	     if(hard>50 && carbon<0.7 && tensile>5600)
        	     {
        	         System.out.println("10");
        	     }
        	     else if(hard>50 && carbon<0.7)
        	     {
        	         System.out.println("9");
        	     }
        	     else if(carbon<0.7 && tensile>5600)
        	     {
        	         System.out.println("8");
        	     }
        	     else if(hard>50 && tensile>5600)
        	     {
        	         System.out.println("7");
        	     }
        	     else if(hard>50 || carbon<0.7 || tensile>5600)
        	     {
        	         System.out.println("6");
        	     }
        	     else
        	     {
        	         System.out.println("5");
        	     }
        	}   
		}
		catch(Exception e) 
		{
		    System.out.println(e);
		}
	}
}
