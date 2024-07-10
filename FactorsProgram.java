import java.util.Scanner;

class FactorsProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        if (num < 0) {
            System.out.println("Invalid input: Number cannot be negative.");
            return;
        }

        int countFactors = 0;
        int nthFactor = 0;

        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                countFactors++;
                System.out.print(i + " ");

                if (countFactors == N) {
                    nthFactor = i;
                }
            }
        }
        System.out.println("\nNumber of factors = " + countFactors);

        if (N > countFactors) {
            System.out.println("Cannot find " + N + "th factor. Input N is larger than number of factors.");
        } else {
            System.out.println(N + "th factor of " + num + " = " + nthFactor);
        }

        scanner.close();
    }
}
