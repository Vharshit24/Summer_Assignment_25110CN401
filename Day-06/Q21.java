// Write a program to Convert decimal to binary.

import java.util.*;

public class Q21 {
    public static void main(String[] args)

    {
        int n;
        String b = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number :");
        n = sc.nextInt();
        while (n > 0) {
            int r = n % 2;
            n = n / 2;
            b = r + b;
        }
        System.out.print(b);
        sc.close();
    }
}