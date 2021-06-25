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
		    int t = sc.nextInt();//testcase
		    for(int i=0;i<t;i++)
		    {
		        int n = sc.nextInt();
		        int an=1;
		        while(an*(an+1)/2<=n){
		            an++;
		        }
		        System.out.println(an-1);
		        
		    }
		}
		catch(Exception e)
		{
		    System.out.println(e);
		}
	}
}
