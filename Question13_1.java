public class Question13_1 {
    public static void printPrimes(int N) {
        for(int i=2; i<=N; i++) {
            boolean isPrime = true;
            for(int j=2; j*j<=i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) System.out.print(i + " ");
        }
    }
    
}
   
