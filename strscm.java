/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class strscm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		int cmp=str1.compareTo(str2);
		if(cmp<0)
			System.out.println(str2);
		else if(cmp==0)
			System.out.println(str1);
		else if(cmp>0)
			System.out.println(str1);
	}
}
