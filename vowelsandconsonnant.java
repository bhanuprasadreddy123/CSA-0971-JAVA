import java.util.Scanner;

public class ConsonantsAndVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine().toLowerCase();

        String vowels = "", consonants = "";
        for (char c : word.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels += c + " ";
            } else if (Character.isLetter(c)) {
                consonants += c + " ";
            }
        }
        
        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
    }
}