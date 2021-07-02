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
        	int t=sc.nextInt();
        	for(int i=0;i<t;i++)
        	{
        	    int xa=sc.nextInt();
        	    int xb=sc.nextInt();
        	    int Xa=sc.nextInt();
        	    int Xb=sc.nextInt();
                int ra=Xa/xa;
                int rb=Xb/xb;
                System.out.println(ra+rb);
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
