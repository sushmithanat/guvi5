/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class find1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		int i;
		for(i=l;i<=r;i++)
		{
			if(i==l)
			{
				System.out.println("no");
				break;
			}
			else if(i==n)
				System.out.println("no");
			else
			{
				
			}
		}
		if(i==r)
			System.out.println("no");
	}
}
