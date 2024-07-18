import java.util.*;
class Leapyear_or_not_ternary
{
public static void main(String arg[])
{
int year;
Scanner sc=  new Scanner(System.in);
System.out.println("ENTER THE year");
year=sc.nextInt();
String res=(year%4==0)? "  IS Leap NUMBER": " IS  NOT Leap NUMBER";
System.out.println(+year+ "" +res);
}
}
