public class Question26_2 {
    
     public static boolean isIsogram(String S) {
        boolean[] seen = new boolean[26];
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int idx = c - 'a';
            if (seen[idx]) return false;
            seen[idx] = true;
        }
        return true;
    }
}
