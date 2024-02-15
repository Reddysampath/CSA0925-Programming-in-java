import java.util.Scanner;
 class SwapNumbers 
 {
    public static void main(Strin arg[]) 
    {
        double firstNumber,secondNumber,temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
         firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
         secondNumber = scanner.nextDouble();
         temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}
