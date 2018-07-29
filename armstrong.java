import java.util.Scanner;
class armstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n,sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(n1==sum)
			System.out.println("yes");
		else
			System.out.println("no");	
		
	}
}
