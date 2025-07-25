public class Question30_1 {
     public static void mergeSort(int[] arr, int l, int r) {
        if(l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
            printArray(arr, l, r);
        }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0; i<n1; i++) L[i] = arr[l + i];
        for(int j=0; j<n2; j++) R[j] = arr[m + 1 + j];

        int i=0, j=0, k=l;
        while(i<n1 && j<n2) {
            if(L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
        while(i<n1) arr[k++] = L[i++];
        while(j<n2) arr[k++] = R[j++];
    }

    private static void printArray(int[] arr, int l, int r) {
        for(int i=l; i<=r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
