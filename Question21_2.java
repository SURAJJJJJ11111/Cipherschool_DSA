public class Question21_2 {
       // Selection Sort with tracking
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            // Print the index selected for min at this iteration
            System.out.println("Iteration " + i + ": selected index " + minIdx);
            int temp = arr[i]; arr[i] = arr[minIdx]; arr[minIdx] = temp;
        }
    }

    // Insertion Sort with shift count
    public static int insertionSort(int[] arr) {
        int n = arr.length, shifts = 0;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                shifts++;
                j--;
            }
            arr[j+1] = key;
            // No count for the assignment of key, only for actual shifts
        }
        return shifts;
    }

    public static void main(String[] args) {
        int[] data1 = {64, 25, 12, 22, 11};
        selectionSort(data1);

        int[] data2 = {64, 25, 12, 22, 11};
        int shiftCount = insertionSort(data2);
        System.out.println("Insertion Sort total shifts: " + shiftCount);
    }
}
