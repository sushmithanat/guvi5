/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class alnu
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int i,count=0,count1=0;
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				count1=1;
				break;
			}
		}
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				count=1;
				break;
			}
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				count=1;
				break;
			}
		}
		if(count==1 && count1==1)
		{
			System.out.println("Yes");	
		}
		else
		{
			System.out.println("No");
		}
	}
}
