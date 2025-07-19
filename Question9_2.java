import java.util.Scanner;

public class Question9_2 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int x = sc.nextInt();
        int first = -1, last = -1;
        for(int i=0; i<n; i++) {
            if(arr[i] == x) {
                if(first == -1) first = i;
                last = i;
            }
        }
        System.out.println(first + " " + last);
    }

}
