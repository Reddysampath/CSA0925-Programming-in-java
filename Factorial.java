import java.util.*;
class Factorial
{
    public static void main(String arg[])
     {
       int i,fact=1,n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the n value:");
       n=sc.nextInt();
       for(i=1;i<=n;i++)
        {
           fact=fact*i;
        }
       System.out.println("factorial of a number:"+fact);
     }
}