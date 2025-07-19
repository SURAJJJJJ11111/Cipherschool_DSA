import java.util.Arrays;

public class Question24_1 {
    public class MinimumPlatforms {
    public static int findMinPlatforms(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int platform_needed = 1, max_platforms = 1;
        int i = 1, j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platform_needed++;
                i++;
            } else {
                platform_needed--;
                j++;
            }
            if (platform_needed > max_platforms)
                max_platforms = platform_needed;
        }
        return max_platforms;
    }

    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findMinPlatforms(arr, dep)); // Output: 3
    }
    
}
}