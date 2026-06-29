
// Write a program to Find x^n without pow(). 
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int base = sc.nextInt();
        System.out.println("Enter Power");
        int power = sc.nextInt();
        int answer = 1;
        for (int i = 1; i <= power; i++) {
            answer *= base;
        }
        System.out.println("Answer: " + answer);
        sc.close();
    }
}
