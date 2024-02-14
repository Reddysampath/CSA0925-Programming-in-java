import java.util.*;
class Dectobin
{
    public static void main(String arg[])
     {
       
       int bin=0,rem,num,i=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       num=sc.nextInt();
       while(num!=0)
       {
         rem=num%2;
         bin+=i*rem;
         num=num/2;
         i=i*10;
        }
        System.out.println("Binary num:" +bin);
     }
}