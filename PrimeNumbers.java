class PrimeNumbersAfterNthPrime {

    public static void main(String[] args) {
        int N = 3; 
        int n = 3; 

        int nthPrime = findNthPrime(N);
        System.out.println(N + "rd Prime number is " + nthPrime);

        int[] primesAfterNth = generatePrimesAfterNth(nthPrime, n);
        System.out.print(n + " prime numbers after " + nthPrime + " are: ");
        for (int i = 0; i < primesAfterNth.length; i++) {
            System.out.print(primesAfterNth[i]);
            if (i < primesAfterNth.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int findNthPrime(int N) {
        int count = 0;
        int number = 2; 
        while (count < N) {
            if (isPrime(number)) {
                count++;
            }
            number++;
        }

        return number - 1;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] generatePrimesAfterNth(int startPrime, int n) {
        int[] primes = new int[n];
        int count = 0;
        int number = startPrime + 1;

        while (count < n) {
            if (isPrime(number)) {
                primes[count] = number;
                count++;
            }
            number++;
        }

        return primes;
    }
}
