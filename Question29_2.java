import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question29_2 {
     public static List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 1; i <= n; i++) {
            String current = q.poll();
            result.add(current);
            q.add(current + "0");
            q.add(current + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        List<String> binaries = generateBinary(n);
        System.out.println(binaries); // [1, 10, 11, 100, 101]
    }
}
