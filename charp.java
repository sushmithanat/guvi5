/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class charp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		for(int i=0;i<str1.length();i++)
		{
			int ch=str1.charAt(i);
			if(str1.charAt(i)>=48 && str1.charAt(i)<=57)
			{
				System.out.print(str1.charAt(i));
			}
		}
	}
}
