import java.util.*;
class Rectangle
{
    public static void main(String arg[])
     {
        double l,b,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        l=sc.nextDouble();
        System.out.println("Enter the breadth:");
        b=sc.nextDouble();
        a=l*b;
        System.out.println("Area="+a);
      }
}