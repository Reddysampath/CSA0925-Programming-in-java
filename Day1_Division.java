import java.util.*;
class Day1_Division
{
   public static void main(String arg[])
   {
     int a,b,Quo,Rem;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the a value:");
     a=sc.nextInt();
     System.out.println("Enter the b value:");
     b=sc.nextInt();
     Quo=a/b;
     Rem=a%b;
     System.out.println("The quotient is:"+Quo);
     System.out.println("The remainder is:"+Rem); 
  }
}   