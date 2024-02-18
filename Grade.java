import java.util.*;
class Grade
{
   public static void main(String arg[])
   {
      int m1,m2,m3,m4;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the marks of python:");
      m1=sc.nextInt();
      System.out.println("Enter the marks of c programming:");
      m2=sc.nextInt();
      System.out.println("Enter the marks of mathematics:");
      m3=sc.nextInt();
      System.out.println("Enter the marks of physics:");
      m4=sc.nextInt();
      int total,avg;
      total=m1+m2+m3+m4;
      avg=total/4;
      System.out.println("total marks"+total);
      System.out.println("Average:"+avg);
      if(avg>75)
       {
         System.out.println("Distinction");
       }
      else if(avg>=60&&avg<75)
       {
         System.out.println("First division");
       }
       else if(avg>=50&&avg<60)
       {
         System.out.println("second division");
       }
       else if(avg>=40&&avg<50)
       {
         System.out.println("third division");
       }
       else
       {
           System.out.println("Fail");
       }
   }
}