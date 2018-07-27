import java.util.Scanner;
class count
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		long num1,count=0;
		while(num>0)
		{
			num1=num%10;
			count++;
			num=num/10;
		}
		System.out.println(count);
	}
}
