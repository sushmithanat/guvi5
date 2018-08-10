/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class oddinn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		++n;
		int count=0;
		for(int i=n;i<m;i++)
		{
			if(i%2==0)
			{
				
			}
			else
			{
				count++;
			}
		}
		for(int i=n;i<m;i++)
		{
			if(i%2!=0)
			{
			if(count==1)
			{
				System.out.print(i);
			}
			else
			{
				System.out.print(i);
				System.out.print(" ");
				
			}
			}
		}
	}
}
