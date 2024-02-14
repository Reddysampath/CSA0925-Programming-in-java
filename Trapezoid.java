import java.util.*;
class Trapezoid
{
    public static void main(String arg[])
     {
       double area,b,h,a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the a value:");
       a=sc.nextInt();
       System.out.println("Enter the b value:");
       b=sc.nextInt();
       System.out.println("Enter the height:");
       h=sc.nextInt();
       a=(a+b)/2*h;
       System.out.println("Area of trapezoid="+a);
     }
}
       