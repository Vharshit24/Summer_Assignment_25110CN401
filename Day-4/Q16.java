
// To Print Armstrong Number In Range.
import java.util.Scanner;
public class Q16 {
    public static void main(String[] arga) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        System.out.println("Armstrong number in given range: ");
        for (int i = 1; i <= n; i++) {
            int count = 0;
            double sum = 0;
            int temp = i;
            while (temp != 0) {
                temp = temp / 10;
                count = count + 1;
            }
            temp = i;
            while (temp != 0) {
                int digit = temp % 10;
                sum = sum + Math.pow(digit, count);
                temp = temp / 10;
            }
            if (i == sum) {
                System.out.print((int) sum);
                System.out.print(" ");
            }

        }

        sc.close();
    }
}
