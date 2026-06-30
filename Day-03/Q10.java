// "Write a program to Print prime numbers in a range.

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter Number");
        int originalNum = sc.nextInt();
         if (originalNum<= 1) {
            System.out.println("Enter number greater than 1");
            return;
        }
        System.out.println("The prime numbers in given range: ");
        for (int num = 2; num <= originalNum; num++) {
             boolean isPrime= true;

             // Only checks up to the square root of num
             
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    isPrime= false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
    }
}
