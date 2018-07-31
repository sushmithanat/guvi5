/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class nfibonacci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1;
		int b=1,i=0;
		while(n>i)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
			i++;
		}
	}
}
