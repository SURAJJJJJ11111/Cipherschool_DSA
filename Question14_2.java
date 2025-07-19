
    public class Question14_2 {

    // Pass-by-value: Primitive type
    static void incrementPrimitive(int x) {
        System.out.println("Inside incrementPrimitive (before): x=" + x);
        x = x + 1;
        System.out.println("Inside incrementPrimitive (after):  x=" + x);
        System.out.println("Primitive x address: " + System.identityHashCode(x));
    }

    // Pass-by-reference equivalent: Using array (reference type)
    static void incrementArray(int[] arr) {
        System.out.println("Inside incrementArray (before): " + arr[0]);
        arr[0] = arr[0] + 1;
        System.out.println("Inside incrementArray (after):  " + arr[0]);
        System.out.println("Array address: " + System.identityHashCode(arr));
    }

    public static void main(String[] args) {
        int x = 5;
        int[] arr = {5};

        System.out.println("=== Using primitive ===");
        System.out.println("Before: x=" + x);
        System.out.println("x address: " + System.identityHashCode(x));
        incrementPrimitive(x);
        System.out.println("After:  x=" + x);

        System.out.println();
        System.out.println("=== Using array (reference type) ===");
        System.out.println("Before: arr[0]=" + arr[0]);
        System.out.println("Array address: " + System.identityHashCode(arr));
        incrementArray(arr);
        System.out.println("After:  arr[0]=" + arr[0]);
    }
}

  