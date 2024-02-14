import java.util.*;
class Palindrome
{
    public static void main(String arg[])
     {
       
       int rev=0,rem,num;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       num=sc.nextInt();
       int x=num;
       while(num!=0)
      {
         rem=num%10;
         rev=rev*10+rem;
         num=num/10;
      }
      if(x==rev)
           { 
             System.out.println(x+ " is a palindrome");
           }
      else
           {
             System.out.println(x+ " is  not  a palindrome");
            }
    }
}