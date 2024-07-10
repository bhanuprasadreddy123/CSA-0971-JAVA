import java.util.Scanner;

public class ReverseAndAddPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine().trim();
        scanner.close();

        try {
            long number = Long.parseLong(input);
            long reverse = getReverse(number);
            long sum = number + reverse;

            while (!isPalindrome(sum)) {
                number = sum;
                reverse = getReverse(number);
                sum = number + reverse;
            }

            System.out.println("Palindrome reached: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }


    private static long getReverse(long number) {
        long reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }


    private static boolean isPalindrome(long number) {
        return number == getReverse(number);
    }
}
