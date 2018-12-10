/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class pow2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(pow2(n))
		System.out.print("yes");
		else
		System.out.print("no");
	}
	public static boolean pow2(int n)
	{
		if(n==0)
		return false;
		while(n!=1)
		{
			if(n%2!=0)
			return false;
			n = n/2;
		}
		return true;
	}
}
