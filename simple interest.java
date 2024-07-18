import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        System.out.print("Enter the rate of interest (%): ");
        double rateOfInterest = scanner.nextDouble();

        double simpleInterest = (principal * rateOfInterest * years) / 100;

        
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
