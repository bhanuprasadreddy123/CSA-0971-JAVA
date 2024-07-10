import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectSquaresWithSumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input lower range
        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        List<Integer> result = findPerfectSquaresWithSumOfDigits(lowerRange, upperRange);

        System.out.println(result);
    }

    public static List<Integer> findPerfectSquaresWithSumOfDigits(int lower, int upper) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = lower; i <= upper; i++) {
            if (isPerfectSquare(i) && sumOfDigits(i) < 10) {
                resultList.add(i);
            }
        }

        return resultList;
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
