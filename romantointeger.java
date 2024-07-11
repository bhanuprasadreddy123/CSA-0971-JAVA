import java.util.*;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            int currentValue = romanValues.get(currentChar);
            
            if (i + 1 < s.length()) {
                char nextChar = s.charAt(i + 1);
                int nextValue = romanValues.get(nextChar);
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        String s1 = "III";
        String s2 = "IV";
        String s3 = "IX";
        String s4 = "LVIII";
        String s5 = "MCMXCIV";
        
        System.out.println("Roman numeral " + s1 + " is converted to integer: " + romanToInt(s1)); 
        System.out.println("Roman numeral " + s2 + " is converted to integer: " + romanToInt(s2)); 
        System.out.println("Roman numeral " + s3 + " is converted to integer: " + romanToInt(s3)); 
        System.out.println("Roman numeral " + s4 + " is converted to integer: " + romanToInt(s4)); 
        System.out.println("Roman numeral " + s5 + " is converted to integer: " + romanToInt(s5)); 
    }
}
