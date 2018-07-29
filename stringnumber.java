/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class stringnumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(isNumeric(str))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	public static boolean isNumeric(String str)
	{
		return str.matches("-?\\d+(\\.\\d+)?");
	}
}
