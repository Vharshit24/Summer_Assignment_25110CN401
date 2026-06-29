
// To Print Multiplication table of given number
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get the multiplication table: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int mult = n*i;
            // System.out.println(n+" X "+i+ "= " +mult);
            System.out.printf("%d X %d = %d\n",n,i,mult);
        }
        sc.close();
    }

}
