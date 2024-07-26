import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String inputString = sc.nextLine();
        System.out.print("Enter the character to be searched: ");
        char searchChar = sc.next().charAt(0);

        boolean found = false;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                System.out.println(searchChar + " is found in string at index: " + i);
                found = true;
                break; // Exit the loop once the character is found
            }
        }

        if (!found) {
            System.out.println(searchChar + " is not found in the string.");
        }
    }
}