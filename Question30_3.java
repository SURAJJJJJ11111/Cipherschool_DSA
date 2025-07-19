public class Question30_3 {
    // Lomuto Partition function
    public static int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        // swap arr[i] and arr[high] (pivot to its correct position)
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    // Quick Sort using Lomuto Partition Scheme, tracking the pivot
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIdx = lomutoPartition(arr, low, high);
            System.out.print("Pivot " + arr[pivotIdx] + " at index " + pivotIdx + ": ");
            printArray(arr, low, high);
            quickSort(arr, low, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    public static void printArray(int[] arr, int l, int r) {
        for (int i = l; i <= r; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        System.out.print("Sorted array: ");
        printArray(arr, 0, arr.length - 1);
    }
}

