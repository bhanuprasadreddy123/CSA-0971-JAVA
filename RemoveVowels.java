import java.util.Scanner;

public class RemoveVowels 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String remove = "";
		int i;
        for (i = 0; i < input.length(); i++) 
		{
            char ch = input.charAt(i);
            if (ch!='a'&& ch!='e'&&ch!='i'&&ch!='o' && ch!='u' && ch !='A' && ch!='E' &&ch!='I'&& ch!= 'O' && ch!='U') 
				{
                remove += ch;
            }
        }
        
        System.out.println("The string without vowels is: " + remove);
    }
}