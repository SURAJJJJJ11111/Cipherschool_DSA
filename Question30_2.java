public class Question30_2
 {

    public static void merge(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int gap = nextGap(n + m);

        while (gap > 0) {
            int i = 0, j = gap;
            // Compare elements in a[]
            for (; j < n; i++, j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            // Compare between a[] and b[]
            for (int k = (j < n ? 0 : j - n); j < n + m && i < n; i++, j++, k++) {
                if (a[i] > b[k]) {
                    int temp = a[i];
                    a[i] = b[k];
                    b[k] = temp;
                }
            }
            // Compare elements in b[]
            if (j >= n) {
                int start = Math.max(0, j - n);
                for (int l = start; j < n + m && l + gap < m; l++, j++) {
                    if (b[l] > b[l + gap]) {
                        int temp = b[l];
                        b[l] = b[l + gap];
                        b[l + gap] = temp;
                    }
                }
            }
            gap = nextGap(gap);
        }
    }

    private static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }

    // Example usage:
    public static void main(String[] args) {
        int[] a = {2, 4, 7, 10};
        int[] b = {2, 3};
        merge(a, b);
        for (int v : a) System.out.print(v + " ");
        System.out.println();
        for (int v : b) System.out.print(v + " ");
    }
}
