import java.util.*;
class Square
{
    public static void main(String arg[])
     {
       int i,j,n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the n value:");
       n=sc.nextInt();
       for(i=1;i<=n;i++)
         {
            for(j=n-1;j>=0;j--)
            {
               System.out.print("*");
            }
            System.out.println();
         }
      }
}
