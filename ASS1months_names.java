import java.util.*;
class ASS1months_names
{
public static void main(String arg[])
{
	int Month_name=0;
	Scanner sc=  new Scanner(System.in);
        System.out.println("ENTER month NO FROM 1 TO 12");
        Month_name=sc.nextInt();
        switch(Month_name)
{
	case 1: 
	System.out.println("January");
	break;
	case 2: 
	System.out.println("Febraury");
	break;
	case 3: 
	System.out.println("March");
	break;
	case 4: 
	System.out.println("April");
	break;
	case 5: 
	System.out.println("May");
	break;
	case 6: 
	System.out.println("June");
	break;
	case 7: 
	System.out.println("July");
	break;
	case 8: 
	System.out.println("August");
	break;
	case 9: 
	System.out.println("September");
	break;
	case 10:
	System.out.println("October");
	break;
	case 11: 
        System.out.println("November");
        break;
	case 12: 
	System.out.println("December");
	break;
	default:
		System.out.println("GIVE CORRECT NUMBERING");
}
}
}