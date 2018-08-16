/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cubea
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int surface=2*a*b+2*b*c+2*c*a;
		int area=a*b*c;
		System.out.print(surface);
		System.out.print(" ");
		System.out.print(area);
	}
}
