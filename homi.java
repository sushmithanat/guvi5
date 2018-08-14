/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class homi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int hh1=sc.nextInt();
		int mm1=sc.nextInt();
		int hh2=sc.nextInt();
		int mm2=sc.nextInt();
		int hh=Math.abs(hh1-hh2);
		int mm=Math.abs(mm1-mm2);
		System.out.println(hh+" "+mm);
	}
}
