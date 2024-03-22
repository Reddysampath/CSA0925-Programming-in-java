import java.util.*;
class Day1_odd_even
{
  public static void main(String arg[])
  {
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    num=sc.nextInt();
    if(num%2==0)
    {
      System.out.println("Even number");
    }
    else
    {
      System.out.println("Odd number");
    }
  }
}