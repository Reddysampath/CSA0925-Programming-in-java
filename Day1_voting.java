import java.util.*;
class Day1_voting
{
  public static void main(String arg[])
  {
    int age;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    age=sc.nextInt();
    if(age<18)
     {
       System.out.println("not eligible for voting");
       int c=18-age;
       System.out.println("You are eligible to vote after years:"+c);
     }
    else
     {
      System.out.println("You are eligible to vote");
     }
  }
}  