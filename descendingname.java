import java.util.Arrays;
import java.util.Collections; 

class SortNamesDescending {
    public static void main(String[] args) {
        String[] names = {"Adam", "Emily", "Daniel", "Abigail", "Benjamin", "Catherine"};

                Arrays.sort(names, Collections.reverseOrder());

        
        System.out.println("Names in descending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
