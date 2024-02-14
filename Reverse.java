import java.util.*;
class Reverse
{
    public static void main(String arg[])
     {
       
       int rev=0,rem,num;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       num=sc.nextInt();
       while(num!=0)
      {
         rem=num%10;
         rev=rev*10+rem;
         num=num/10;
      }
   System.out.println("Reverse number:"+rev);
    }
}