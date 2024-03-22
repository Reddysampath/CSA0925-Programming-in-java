import java.util.*;
class Day1_leapyear_ternary
{
  public static void main(String arg[])
  {
    int year;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    year=sc.nextInt();
    String leap=(year%4==0)? "leapyear": "notleapyear";
    System.out.println("Output:"+leap);
  }
}