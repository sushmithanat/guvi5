import java.util.Scanner;
class even
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		for(int i=n+1;i<q;i++)
		{
			if(i%2==0)
				System.out.print(i+"\t");
		}
	}
}
