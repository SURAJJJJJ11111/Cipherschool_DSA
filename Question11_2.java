public class Question11_2 {
    public static int factorial(int n) {
        int fact = 1;
        for(int i=2; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }
}
