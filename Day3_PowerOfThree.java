 class Day3_PowerOfThree
 {
    public static void main(String arg[]) 
     {
        int num = 32;
        System.out.println("Input = " + num);
        
        if (num <= 0)
        {
            System.out.println("Output = false");
            return;
        }
        
        while (num % 3 == 0) {
            num /= 3;
        }
        
        System.out.println("Output = " + (num == 1 ? "true" : "false"));
    }
}
