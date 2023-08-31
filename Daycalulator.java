import java.util.Scanner;

public class Daycalculator{
    public static void main(String[] args){

        Scanner sca = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");

        int month = sca.nextInt();

        int days = getDaysInMonths(month);

        if (days != -1) {
            System.out.println("Number of days in month " + month + ": " + days);
        } else {
            System.out.println("Invalid month input.");
        }

        scanner.close();
    }
    public static int getDaysInMonth(int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28;
            default:
                return -1; 
        }
    }
}