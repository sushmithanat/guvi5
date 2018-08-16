/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class odddig
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,odd=0,num=n;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2!=0)
			{
				count++;
				odd=odd*10+rem;
			}
			n=n/10;
		}
		while(odd>0)
		{
			int rem=odd%10;
			if(rem%2!=0)
			{
			if(count==1)
				System.out.print(rem);
			else
			{
				System.out.print(rem);
				System.out.print(" ");
				count--;
			}
			}
			odd=odd/10;
		}
		
		
	}
}
