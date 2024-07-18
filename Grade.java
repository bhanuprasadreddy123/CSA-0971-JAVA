import java.util.Scanner;
class Marks 
{
    int python, cProgramming, mathematics, physics;
    void getMarks()
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks in Python: ");
        python = scanner.nextInt();
        System.out.print("Enter the marks in C Programming: ");
        cProgramming = scanner.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        mathematics = scanner.nextInt();
        System.out.print("Enter the marks in Physics: ");
        physics = scanner.nextInt();
    }
}  
class TotalAggregate extends Marks 
{
    int total;
    double aggregate;

    void calculate()
	{
        total = python + cProgramming + mathematics + physics;
        aggregate = total / 4.0;
    }
}
class Grade extends TotalAggregate
 {
    void displayGrade() 
	{
        System.out.println("Total = " + total);
        System.out.println("Aggregate = " + aggregate);

        if (aggregate > 75) 
		{
            System.out.println("DISTINCTION");
        } 
		else if (aggregate >= 60 && aggregate < 75) 
		{
            System.out.println("FIRST DIVISION");
        }
		else if (aggregate >= 50 && aggregate < 60) 
		{
            System.out.println("SECOND DIVISION");
        } 
		else if (aggregate >= 40 && aggregate < 50)
		{
            System.out.println("THIRD DIVISION");
        }
		else {
            System.out.println("FAIL");
        }
    }
  public static void main(String[] args) 
	{
        Grade grade = new Grade();
        grade.getMarks();
        grade.calculate();
        grade.displayGrade();
    }
}