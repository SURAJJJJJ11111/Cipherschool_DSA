import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question33_4 {
    
    
    public static List<Integer> countDistinct(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        if(k > arr.length) return result;

        Map<Integer, Integer> freqMap = new HashMap<>();
        // Initialize with first k elements
        for (int i = 0; i < k; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
        }
        result.add(freqMap.size());

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            // Remove the (i-k)th element
            int outgoing = arr[i - k];
            freqMap.put(outgoing, freqMap.get(outgoing) - 1);
            if (freqMap.get(outgoing) == 0)
                freqMap.remove(outgoing);

            // Add the new element
            int incoming = arr[i];
            freqMap.put(incoming, freqMap.getOrDefault(incoming, 0) + 1);

            result.add(freqMap.size());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 1, 3, 4, 2, 3};
        int k1 = 4;
        System.out.println(countDistinct(arr1, k1)); // [3, 4, 4, 3]

        int[] arr2 = {4, 1, 1};
        int k2 = 2;
        System.out.println(countDistinct(arr2, k2)); // [2, 1]

        int[] arr3 = {1, 1, 1, 1, 1};
        int k3 = 3;
        System.out.println(countDistinct(arr3, k3)); // [1, 1, 1]
    }

}
