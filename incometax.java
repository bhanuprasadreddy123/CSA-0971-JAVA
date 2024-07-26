import java.util.Scanner;
class tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income: ");
        double income = sc.nextDouble();
        double tax = 0;
        double taxableIncome = 0;
        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            taxableIncome = income - 250000;
            tax = taxableIncome * 0.10;
        } else if (income <= 1000000) {
            taxableIncome = income - 500000;
            tax = 250000 * 0.10 + taxableIncome * 0.20;
        } else {
            taxableIncome = income - 1000000;
            tax = 250000 * 0.10 + 500000 * 0.20 + taxableIncome * 0.30;
        }
        System.out.println("Taxable Income: " + (income - 250000));
        System.out.println("Tax = " + tax);
    }
}