import java.util.*;
class Day3skip_number
{
   public static void main(String arg[])
   {
     int m,n,k,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the M value:");
     m=sc.nextInt();
     System.out.println("Enter the n value:");
     n=sc.nextInt();
     System.out.println("Enter the k value to skip:");
     k=sc.nextInt();
     for(i=m;i<=n;i=i+k+1)
      {
         System.out.println(i+ " ");
       }
   }
}
     
   