import java.util.HashMap;

public class Question16_2 {
      public static HashMap<Character, Integer> charFrequency(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }
}
