// "Write a program to Print prime numbers in a range.

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int originalNum = sc.nextInt();
        System.out.println("The prime numbers in given range: ");
        for (int num = 1; num <= originalNum; num++) {
            int i;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {

                    break;
                }
            }
            if (i == num) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
