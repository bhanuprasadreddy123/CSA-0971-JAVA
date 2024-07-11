public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        
        
        int[] magazineFreq = new int[26];
        int[] ransomNoteFreq = new int[26];
        
        
        for (char ch : magazine.toCharArray()) {
            magazineFreq[ch - 'a']++;
        }
        
        
        for (char ch : ransomNote.toCharArray()) {
            ransomNoteFreq[ch - 'a']++;
        }
        
        
        for (int i = 0; i < 26; i++) {
            if (ransomNoteFreq[i] > magazineFreq[i]) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        
        String ransomNote1 = "a", magazine1 = "b";
        String ransomNote2 = "aa", magazine2 = "ab";
        String ransomNote3 = "aa", magazine3 = "aab";
        
        System.out.println(canConstruct(ransomNote1, magazine1));  
        System.out.println(canConstruct(ransomNote2, magazine2)); 
        System.out.println(canConstruct(ransomNote3, magazine3)); 
    }
}
