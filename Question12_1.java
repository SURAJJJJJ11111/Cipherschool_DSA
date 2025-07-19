public class Question12_1 {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > largest) {
                second = largest;
                largest = num;
            } else if(num > second && num < largest) {
                second = num;
            }
        }
        return second;
    }
    
}
