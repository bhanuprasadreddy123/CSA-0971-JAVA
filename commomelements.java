import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 5, 6, 7};
        
        int[] commonElements = findCommonElements(arr1, arr2);
        
        System.out.println("Common elements: " + Arrays.toString(commonElements));
    }
    
    public static int[] findCommonElements(int[] arr1, int[] arr2) {
       
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        
        Set<Integer> commonSet = new HashSet<>();
        for (int num : arr2) {
            if (set.contains(num)) {
                commonSet.add(num);
            }
        }
        
        int[] result = new int[commonSet.size()];
        int index = 0;
        for (int num : commonSet) {
            result[index++] = num;
        }
        
        return result;
    }
}
