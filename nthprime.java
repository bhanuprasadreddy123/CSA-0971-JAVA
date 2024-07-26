import java.util.Scanner;
class nthprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers to print: ");
        int n = sc.nextInt();
        int ct=0,num=2;
        while(ct<n){
          int flag=0;
          for(int i=2;i<=Math.sqrt(num);i++){
             if(num%i==0){
               flag=1;
               break;
             }
            }
             if(flag==0){
             System.out.print(num+" ");
             ct++;
             }
           num++;
      }               
    }
}