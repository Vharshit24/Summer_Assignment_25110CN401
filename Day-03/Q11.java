// "To find GCD of two number"
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();
        int GCD = 1;
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                GCD = i;
            }

        }
        System.out.println("GCD of " + num1 + " and " + num2 + ": " + GCD);

        sc.close();
    }
}
