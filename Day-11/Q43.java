
// Write a program to Write function to check prime.
import java.util.Scanner;
public class Q43 {
    public static boolean prime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                // return isPrime;
                break;
            }
        }
        // if (i==n) {
        return isPrime;
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println("Enter value greater than 1");
        }
        if (Q43.prime(n) == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a prime");
        }
        sc.close();
    }
}
