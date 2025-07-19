import java.util.LinkedList;
import java.util.Queue;

public class Question29_3 {
    public static String firstNonRepeating(String s) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
            q.offer(c);
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.poll();
            }
            if (q.isEmpty()) {
                ans.append('#');
            } else {
                ans.append(q.peek());
            }
        }
        return ans.toString();
    }
}
