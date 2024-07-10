import java.util.ArrayList;
import java.util.Scanner;

public class NumberSquareArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        scanner.close();

        ArrayList<Pair> result = createNumberSquareArray(lowerRange, upperRange);

        System.out.println("Sample Output:");
        System.out.println(result);
    }

    public static ArrayList<Pair> createNumberSquareArray(int lowerRange, int upperRange) {
        ArrayList<Pair> pairs = new ArrayList<>();

        for (int i = lowerRange; i <= upperRange; i++) {
            pairs.add(new Pair(i, i * i));
        }

        return pairs;
    }

    static class Pair {
        int number;
        int square;

        Pair(int number, int square) {
            this.number = number;
            this.square = square;
        }

        @Override
        public String toString() {
            return "(" + number + ", " + square + ")";
        }
    }
}

