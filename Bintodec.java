import java.util.*;
class Bintodec
{
    public static void main(String arg[])
     {
       
       int dec=0,rem,num,i=1;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number:");
       num=sc.nextInt();
       while(num!=0)
       {
         rem=num%10;
         dec+=i*rem;
         num=num/10;
         i=i*2;
        }
        System.out.println("Decimal  number:" +dec);
     }
}