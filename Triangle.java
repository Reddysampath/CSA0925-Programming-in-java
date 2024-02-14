import java.util.*;
class Triangle
{
    public static void main(String arg[])
     {
       int b,h,a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the breadth:");
       b=sc.nextInt();
       System.out.println("Enter the height:");
       h=sc.nextInt();
       a=(b*h)/2;
       System.out.println("Area of triangle="+a);
     }
}
       