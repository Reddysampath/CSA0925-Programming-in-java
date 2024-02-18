import java.util.*;
class Money
{
   public static void main(String arg[])
   {
     Scanner sc=new Scanner(System.in);
     int n1,d1,n2,d2,n3,d3,n4,d4,total;
     System.out.println("Enter the 1 denomination:");
     d1=sc.nextInt();
     System.out.println("Enter the number of notes:");
     n1=sc.nextInt();
     System.out.println("Enter the 2 denomination:");
     d2=sc.nextInt();
     System.out.println("Enter the number of notes:");
     n2=sc.nextInt();
     System.out.println("Enter the 3 denomination:");
     d3=sc.nextInt();
     System.out.println("Enter the number of notes:");
     n3=sc.nextInt();
     System.out.println("Enter the 4 denomination:");
     d4=sc.nextInt();
     System.out.println("Enter the number of notes:");
     n4=sc.nextInt();
     total=(d1*n1)+(n2*d2)+(n3*d3)+(n4*d4);
     System.out.println("Total Available balance:"+total);
   }
}