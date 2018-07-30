/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class specialcharcnt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0,i=0;
		for(i=0;i<str.length();i++)
		{
			int ch=str.charAt(i);
			if(ch>=33 && ch<=47)
				count++;
			else if(ch>=58 && ch<=64)
				count++;
			else if(ch>=91 && ch<=96)
				count++;
			else if(ch>=123 && ch<=127)
				count++;
			else
			{
			}
		}
		System.out.println(count);
	}
}
