import java.util.*;
class Day1_weekday
{
  public static void main(String arg[])
  {
    int weeknum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number from 1-7:");
    weeknum=sc.nextInt();
    
    switch (weeknum) 
   {
    case 1:
      System.out.printf("Sunday");
      break;

    
    case 2:
      System.out.printf("Monday");
      break;

     
    case 3:
      System.out.printf("Tuesday");
      break;
   
    
    case 4:
      System.out.printf("Wednesday");
      break;

    
    case 5:
      System.out.printf("Thursday");
      break;

    
    case 6:
      System.out.printf("Friday");
      break;
  
    
    case 7:
      System.out.printf("Saturday");
      break;
  
    default:
      System.out.printf("Invalid weekday number.");
    }
  }
}



