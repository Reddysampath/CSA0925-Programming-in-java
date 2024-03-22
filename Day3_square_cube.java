import java.util.*;
class Day1_square_cube
{
   public static void main(String arg[])
   {
     double a,b,c;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the a value:");
     a=sc.nextDouble();
     b=Math.pow(a,2);
     c=Math.pow(a,3);
     System.out.println("Square of number is:" +b);
     System.out.println("cube of number is:" +c);
   }
}
       