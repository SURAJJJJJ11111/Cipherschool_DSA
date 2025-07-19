public class Question22_2 {
       public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1, count = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            count++;
            System.out.println("Iteration " + count + ": mid = " + mid);
            if (arr[mid] == target)
                return count;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 7;
        int iterations = binarySearch(arr, target);
        System.out.println("Total iterations: " + iterations);
    }
    
}
