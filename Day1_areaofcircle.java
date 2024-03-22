import java.util.*;
class Day1_areaofcircle
{
   public static void main(String arg[])
   {
     double r,area;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the radius value:");
     r=sc.nextDouble();
     area=3.14*r*r;
     System.out.println("Area of circle:"+area);
    }
}
     