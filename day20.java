import java.util.Scanner;

public class day20 {
    
    // Function to compute factorial of a number
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to compute nCr using factorial formula
    public static long nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values for n and r
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        // Calculate and display nCr
        long result = nCr(n, r);
        System.out.println("The value of " + n + "C" + r + " is: " + result);

        scanner.close();
    }
}