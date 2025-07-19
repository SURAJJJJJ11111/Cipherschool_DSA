import java.util.Arrays;

class Question33_2 {
    static int findLongestConsecutiveSequence(int[] arr) {
        Arrays.sort(arr);
        int maxLen = 1, currentLen = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                continue;
            if (arr[i] == arr[i - 1] + 1) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            if (currentLen > maxLen)
                maxLen = currentLen;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(findLongestConsecutiveSequence(arr));
    }
}
