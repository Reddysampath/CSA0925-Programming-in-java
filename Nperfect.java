import java.util.*;
class Nperfect
{
   public static void main(String arg[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the n value:");
       int n=sc.nextInt();
       int sum=0,temp=0;
       for(int j=2;j<=1000;j++)
       {
          if(n>temp)
              sum=1;
       for(int i=2;i<j;i++)
         {
           if(j%i==0)
           sum=sum+i;
         }
       if(sum==j)
         {
           System.out.println(j+ " ");
           temp=temp+1;
         }
      }
   }
}