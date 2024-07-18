import java.util.Arrays;

public class SortNames {

    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "Eve", "Charlie"};

        Arrays.sort(names);

        System.out.println("Names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
