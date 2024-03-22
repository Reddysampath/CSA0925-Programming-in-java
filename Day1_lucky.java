import java.util.*;
class Day1_lucky
{
  public static void main(String arg[])
  {
    int luckynum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number from 1-5:");
    luckynum=sc.nextInt();
    
    switch (luckynum) 
   {
    case 1:
      //break;

    case 2:
      System.out.printf("Winner");
      break;

    case 3:
      //break; 
    
    case 4:
     // break;

    case 5:
      //break;
    default:
      System.out.printf("Better luck next time");
    }
  }
}
