import java.util.HashSet;
import java.util.Set;

public class UniquePermutations {
    public static void main(String[] args) {
      
        printUniquePermutations(0);
        printUniquePermutations(111);
        printUniquePermutations(505);
        printUniquePermutations(-143);
        printUniquePermutations(-598);
    }

    public static void printUniquePermutations(int number) {
        System.out.println("Given Number: " + number);
        System.out.println("Permutations are:");
        Set<String> result = new HashSet<>();
        generatePermutations(String.valueOf(number), 0, result);
        for (String permutation : result) {
            System.out.println(permutation);
        }
        System.out.println();
    }

    private static void generatePermutations(String number, int index, Set<String> result) {
        if (index == number.length()) {
            result.add(number);
            return;
        }

        for (int i = index; i < number.length(); i++) {
            
            number = swap(number, index, i);
            
            generatePermutations(number, index + 1, result);
            
            number = swap(number, index, i);
        }
    }

    private static String swap(String number, int i, int j) {
        char[] chars = number.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
}
