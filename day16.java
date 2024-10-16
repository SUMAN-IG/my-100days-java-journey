import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();
        double tax = 0;

        // Calculate tax based on income slabs
        if (income > 250000 && income <= 500000) {
            tax = (income - 250000) * 0.05;
        } else if (income > 500000 && income <= 1000000) {
            tax = (500000 - 250000) * 0.05 + (income - 500000) * 0.20;
        } else if (income > 1000000) {
            tax = (500000 - 250000) * 0.05 + (1000000 - 500000) * 0.20 + (income - 1000000) * 0.30;
        }

        // Output the calculated tax
        System.out.println("The income tax is: " + tax);
        
        scanner.close();
    }
}
