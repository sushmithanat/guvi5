/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class apn
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		int p1=2*a+((n-1)*d);
		int p=(n*p1)/2;
		System.out.println(p);
	}
}