import java.util.Scanner;
class pattern
{
    public static void main(String arg[])
    {
        int rev=0,rem,n,x;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter nuumber:");
        n=scanner.nextInt();
        x=n;
        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(x==rev)
        {
          System.out.println("pali");   
        }
        else
        {
             System.out.println("not");
        }
    }
}