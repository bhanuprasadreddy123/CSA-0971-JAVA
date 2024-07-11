import java.util.*;

public class WeakestRows {
    public static int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> rows = new ArrayList<>();
        
        for (int i = 0; i < mat.length; i++) {
            int soldiers = countSoldiers(mat[i]);
            rows.add(new int[]{i, soldiers});
        }
        
        Collections.sort(rows, (a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]); 
            } else {
                return Integer.compare(a[0], b[0]); 
            }
        });
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rows.get(i)[0]; 
        }
        
        return result;
    }
    
    private static int countSoldiers(int[] row) {
        int count = 0;
        for (int num : row) {
            if (num == 1) {
                count++;
            } else {
                break; 
            }
        }
        return count;
    }

    public static void main(String[] args) {
    
        int[][] mat1 = {
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };
        int k1 = 3;
        
        int[][] mat2 = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
        };
        int k2 = 2;
        
        int[] result1 = kWeakestRows(mat1, k1);
        System.out.println("Output for mat1 and k1: " + Arrays.toString(result1)); 
        
        int[] result2 = kWeakestRows(mat2, k2);
        System.out.println("Output for mat2 and k2: " + Arrays.toString(result2)); 
    }
}
