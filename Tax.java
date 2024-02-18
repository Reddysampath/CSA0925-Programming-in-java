import java.util.*;
class Tax
{
   public static void main(String arg[])
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income:");
        int income=sc.nextInt();
        double tax;
        if(income<=150000)
           {
               System.out.println("No tax");
            }
        else if(income>=150001&&income<=300000)
           {
              System.out.println("tax="+income/10);
           }
        else if(income>=300001&&income<=500000)
           {
              System.out.println("tax="+income/20);
           }
        else
           {  
             System.out.println("tax="+income/30);
           }
    }
}