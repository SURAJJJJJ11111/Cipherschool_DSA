public class Question15_2 {
  public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        return new int[]{min, max};
    }
}