import java.util.*;
class Armstrong
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
         rev+=rem*rem*rem;
         num=num/10;
      }
      if(x==rev)
           { 
             System.out.println(x+ " is a armstrong number");
           }
      else
           {
             System.out.println(x+ " is  not  a armstrong number");
            }
    }
}