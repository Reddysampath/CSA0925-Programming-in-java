import java.util.*;
class Number
{
    public static void main(String arg[])
     {
       int a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       a=sc.nextInt();
       if(a%2==0)
      {
         System.out.println("Even numbers");
       }
       else
        {
           System.out.println("Odd numbers");
         }
    }
}