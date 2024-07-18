public class FibonacciSum {
    public static void main(String[] args) {
        int n = 10,sum=0,a=0,b=1,i;
        

        for ( i = 1; i <= n; i++) {
            sum += b;
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Sum of first " + n + " Fibonacci numbers: " + sum);
    }
}
