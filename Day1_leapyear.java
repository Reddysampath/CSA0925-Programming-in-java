import java.util.*;
class Day1_leapyear
{
  public static void main(String arg[])
  {
    int year;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    year=sc.nextInt();
    if(year%4==0)
     {
       System.out.println("Leap year");
     }
    else
     {
       System.out.println("Not a leap year");
     }
  }
}