import java.util.Scanner;

public class Question7_1 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        float height = sc.nextFloat();
        System.out.printf("Name: %s, Age: %d, Height: %.1f\n", name, age, height);
    }

    
}