import java.util.*;
class Day4_Bin_Oct
{
public static void main(String arg[])
{
   int bin=0,oct=0,i=1,j=1,rem,num,rem1;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number");
   num=sc.nextInt();
   int temp=num;
   while(num!=0)
   {
     rem=num%2;
     bin+=i*rem;
     num=num/2;
     i=i*10;
   }
   
   while(temp!=0)
    {
      rem1=temp%8;
      oct+=j*rem1;
      temp=temp/8;
      j=j*10;
     }
    System.out.println("the binary num is:"+bin);
    System.out.println("The octal num is:"+oct);
  }
}
   
