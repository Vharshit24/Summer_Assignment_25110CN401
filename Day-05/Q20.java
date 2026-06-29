
// Write a program to Find largest prime factor.
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i,j;
        int largestPrime = 0;
        if (n<=1) {
            System.out.println("Enter value greater than 1");
            sc.close();
            return ;
        }
        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                for (j = 2; j< i; j++) {
                    if (i % j == 0) { // number is divisible
                        break;
                    }

                }
                if (i == j) {
                    largestPrime = i;

                }
            }
        }
        System.out.println(largestPrime);

        sc.close();
    }

}