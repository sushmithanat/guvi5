/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.util.ArrayList;

/* Name of the class has to be "Main" only if the class is public. */
class intstr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		char c=sc.next().charAt(0);
		int b=sc.nextInt();
		switch(c)
		{
			case '/':int res=a/b;
			System.out.println(res);
			break;
			case '%':res=a%b;
			System.out.println(res);
			break;
		}
	}
}
