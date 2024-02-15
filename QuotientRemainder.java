import java.util.Scanner;

 class QuotientRemainder
  {
    public static void main(String args[])
      {
        int dividend,divisor,quotient,remainder;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        dividend = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        divisor = scanner.nextInt();
         quotient = dividend / divisor;
         remainder = dividend % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
