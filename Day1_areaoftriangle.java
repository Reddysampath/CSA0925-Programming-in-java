import java.util.*;
class Day1_areaoftriangle
{
   public static void main(String arg[])
   {
     int b,h,area;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the breadth value:");
     b=sc.nextInt();
     System.out.println("Enter the height value:");
     h=sc.nextInt();
     area=(b*h)/2;
     System.out.println("Area of triangle is:" +area);
    }
}