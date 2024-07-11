public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
     
        s = s.trim();
        
        int lastIndex = s.lastIndexOf(' ');
        
        if (lastIndex == -1) {
            return s.length();
        } else {
            return s.length() - lastIndex - 1;
        }
    }

    public static void main(String[] args) {
       
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "   ";
        
        System.out.println("Length of the last word in \"" + s1 + "\": " + lengthOfLastWord(s1)); 
        System.out.println("Length of the last word in \"" + s2 + "\": " + lengthOfLastWord(s2)); 
        System.out.println("Length of the last word in \"" + s3 + "\": " + lengthOfLastWord(s3)); 
    }
}
