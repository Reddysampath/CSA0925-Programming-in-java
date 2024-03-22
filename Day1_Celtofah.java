import java.util.*;
class Day1_Celtofah
{
   public static void main(String arg[])
    {
      double cel1,fah1;
      double fah2,cel2;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the celsius degree:");
      cel1=sc.nextDouble();
      fah1=(cel1*(9/5))+32;
      System.out.println("The Fahrenheit degree is:"+fah1);
      System.out.println("Enter the fahrenheit degree:");
      fah2=sc.nextDouble();
      cel2=(fah2-32) * (5.0/9.0);
      System.out.println("The centigrade is:"+cel2);
    }
}