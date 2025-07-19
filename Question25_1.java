public class Question25_1 {
      public static void printDescending(int n) {
        if(n < 1) return;
        System.out.print(n + " ");
        printDescending(n - 1);
    }
}
