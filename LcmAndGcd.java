class LcmAndGcd
{
    public static void main(String arg[])
    {
        int num1=23;
        int num2=34;
        int lcm,gcd;
        lcm=findLCM(num1,num2);
        gcd=findGCD(num1,num2);
        System.out.println("lcm is"+lcm);
        System.out.println("gcd is"+gcd);
    }
     public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}