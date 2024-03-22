import java.util.*;
class Day1_Swapping
{
   public static void main(String arg[])
   {
     double temp,a,b;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the a value:");
     a=sc.nextDouble();
     System.out.println("Enter the b value:");
     b=sc.nextDouble();
     temp=a;
     a=b;
     b=temp;
     System.out.println("the First number is:"+a);
     System.out.println("The second number is:"+b);
   }
}