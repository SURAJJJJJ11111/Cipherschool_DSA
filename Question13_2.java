public class Question13_2 {
     public static boolean isPalindrome(int n) {
        int original = n, rev = 0;
        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return original == rev;
    }
    
}
