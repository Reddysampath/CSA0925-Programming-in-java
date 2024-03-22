import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter consumer number: ");
        int consumerNo = scanner.nextInt();

        System.out.print("Enter consumer name: ");
        String consumerName = scanner.next();

        System.out.print("Enter previous month's reading: ");
        double prevMonthReading = scanner.nextDouble();

        System.out.print("Enter current month's reading: ");
        double currMonthReading = scanner.nextDouble();

        double unitsConsumed = currMonthReading - prevMonthReading;
        double billAmount;

        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 1;
        } else if (unitsConsumed <= 200) {
            billAmount = 100 + (unitsConsumed - 100) * 2.5;
        } else if (unitsConsumed <= 500) {
            billAmount = 100 + 100 * 2.5 + (unitsConsumed - 200) * 4;
        } else {
            billAmount = 100 + 100 * 2.5 + 300 * 4 + (unitsConsumed - 500) * 6;
        }

        System.out.println("Electricity bill for consumer " + consumerNo + " (" + consumerName + "): Rs. " + billAmount);
    }
}
