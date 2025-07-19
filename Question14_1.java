public class Question14_1 {
        public static void swap(int[] a, int[] b) {
        int temp = a[0];
        a[0] = b[0];
        b[0] = temp;
    }

    public static void main(String[] args) {
        int[] x = {5};
        int[] y = {10};
        swap(x, y);
        System.out.println(x[0] + " " + y[0]);
    }

    
}
