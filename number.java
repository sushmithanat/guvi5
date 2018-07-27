import java.util.Scanner;
class Positive
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    long number=sc.nextLong();
    if(number>0)
      System.out.println("Positive");
     else if(number<0)
      System.out.println("Negative");
     else
      System.out.println("Zero");
     }
   }
