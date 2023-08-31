import java.util.Scanner;

public class Currencyconvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount in US Dollars: ");
        double usdAmount = scanner.nextDouble();

        double rupeeAmount = convertToRupees(usdAmount);

        System.out.println(usdAmount + " US Dollars is equal to " + rupeeAmount + " Indian Rupees.");

        scanner.close();
    }

    public static double convertToRupees(double usdAmount) {

        double exchangeRate = 82.6;
        return usdAmount * exchangeRate;
    }
}
