/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class hrmm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int min=sc.nextInt();
		int hr=min/60;
		int mm=min%60;
		System.out.println(hr+" "+mm);
	}
}
