// Write a program to Write function for perfect number.
import java.util.*;

public class Q48 {
    public static boolean perfect(int originalNum) {
        int sum = 0;
        boolean isPerfect = false;
        for (int i = 1; i <= originalNum/2; i++) {
            if (originalNum % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == originalNum) {
            isPerfect = true;
        }
        return isPerfect;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int originalNum = sc.nextInt();
        if (Q48.perfect(originalNum) ) {
            System.out.println(originalNum + " is a perfect number");
        } else {
            System.out.println(originalNum + " is not a perfect number");
        }
        sc.close();
    }
}
