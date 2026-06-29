
// Write a program to Print number triangle.
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int count = 0;                 // initializing count in the first loop so that it get
                                           // reset everytime before it goes inside the second loop.
            for (int j = 1; j <= i; j++) {
                count += 1;
                System.out.print(count);
            }
            System.out.println("");
        }
        sc.close();
    }
}