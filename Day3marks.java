import java.util.*;
class Day3marks
{
  public static void main(String arg[])
   {
      int python,c,maths,physics,total;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the marks in python:");
      python=sc.nextInt();
      System.out.println("Enter the marks in c programming:");
      c=sc.nextInt();
      System.out.println("Enter the marks in Mathematics:");
      maths=sc.nextInt();
      System.out.println("Enter the marks in physics:");
      physics=sc.nextInt();
      double avg;
      total=python+c+maths+physics;
      avg=total/4;
      if(avg>=75)
      {
         System.out.println("passed in distinction:");
       }
      else if(avg>=60 && avg<75)
       {
         System.out.println("Grade is First division");
       }
       else if(avg>=50 && avg<60)
       {
         System.out.println("Grade is second division");
       }
       else if(avg>=40 && avg<50)
       {
         System.out.println("Grade is Third division");
       }
       else
       {
         System.out.println("Fail");
       }
   }
}

      