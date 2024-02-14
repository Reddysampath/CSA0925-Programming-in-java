import java.util.*;
class Eligible
{
    public static void main(String arg[])
     {
       int age;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the age:");
       age=sc.nextInt();
        if(age>=0)
       {
         System.out.println("Eligible for voting");
        }
        else
       {
          System.out.println(" Not eligible for voting");
        }
   }
}