import java.util.*;
class Numberpattern1
{
    public static void main(String arg[])
     {
       int i,j,n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the n value:");
       n=sc.nextInt();
       for(i=1;i<=n;i++)
         {
            for(j=1;j<=i;j++)
            {
               System.out.print(j+ " " );
            }
            System.out.println();
         }
      }
}