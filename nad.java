/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class nad
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		int p2=(2*a)+((n-1)*d);
		int p1=(n*p2)/2;
		System.out.println(p1);
	}
}
