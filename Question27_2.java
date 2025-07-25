public class Question27_2 {
    public static int majorityElement(int[] arr) {
        int candidate = -1, count = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }
        return count > arr.length / 2 ? candidate : -1;
    }
    
}
