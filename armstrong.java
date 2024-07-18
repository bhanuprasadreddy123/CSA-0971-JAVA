import java.util.Scanner;
class armstrong
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
            rev=rev+(rem*rem*rem*);
            n=n/10;
        }
        if(x==rev)
        {
          System.out.println("arm");   
        }
        else
        {
             System.out.println("not");
        }
    }
}