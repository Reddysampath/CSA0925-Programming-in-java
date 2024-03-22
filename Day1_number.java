import java.util.*;
class Day1_number
{
  public static void main(String arg[])
  {
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    num=sc.nextInt();
    if(num>0)
     {
       System.out.println("Positive number");
     }
    else
     {
       System.out.println("Negative number");
     }
  }
}