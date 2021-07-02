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
        	    int a=sc.nextInt();
        	    int b=sc.nextInt();
        	    int c=sc.nextInt();
        	    int d=sc.nextInt();
                int angle1=a+c;
                int angle2=b+d;
                if(angle1==180 && angle2==180)
        	    System.out.println("YES");
        	    else
        	    System.out.println("NO");
        	}
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
