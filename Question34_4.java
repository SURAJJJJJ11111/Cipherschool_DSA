import java.util.Arrays;

public class Question34_4 {
     public static boolean canPlace(int[] stalls, int k, int minDist) {
        int count = 1;          // One cow placed at the first stall
        int last = stalls[0];   // Position of the last cow placed
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - last >= minDist) {
                count++;
                last = stalls[i];
                if (count == k)
                    return true;
            }
        }
        return false;
    }
    
    // Main function: returns the largest minimum distance
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int low = 1, high = stalls[stalls.length - 1] - stalls[0];
        int result = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlace(stalls, k, mid)) {
                result = mid;
                low = mid + 1; // Try for a bigger minimum distance
            } else {
                high = mid - 1; // Try for a smaller distance
            }
        }
        return result;
    }
    
    // Example usage
    public static void main(String[] args) {
        int[] stalls1 = {1, 2, 4, 8, 9};
        int k1 = 3;
        System.out.println(aggressiveCows(stalls1, k1)); // Output: 3

        int[] stalls2 = {10, 1, 2, 7, 5};
        int k2 = 3;
        System.out.println(aggressiveCows(stalls2, k2)); // Output: 4

        int[] stalls3 = {2, 12, 11, 3, 26, 7};
        int k3 = 5;
        System.out.println(aggressiveCows(stalls3, k3)); // Output: 1
    }
}
