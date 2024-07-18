import java.util.Scanner;

public class FibonacciWithThreads implements Runnable {
    private int n;

    public FibonacciWithThreads(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int count = scanner.nextInt();
        scanner.close();

        Thread fibonacciThread = new Thread(new FibonacciWithThreads(count));
        fibonacciThread.start();
    }
}