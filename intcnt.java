/* package whatever; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class intcnt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='1' || str.charAt(i)=='2'
|| str.charAt(i)=='3' || str.charAt(i)=='4' || str.charAt(i)=='5' || str.charAt(i)=='6' || str.charAt(i)=='7' || str.charAt(i)=='8' || str.charAt(i)=='9' || str.charAt(i)=='0')
			count++;
		}
		System.out.println(count);
	}
}
