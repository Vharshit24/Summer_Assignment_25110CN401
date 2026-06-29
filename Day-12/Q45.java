
// Write a program to Write function for palindrome.
import java.util.Scanner;
public class Q45 {
    public static boolean checkPalindrome(int originalNum) {
        boolean isPalindrome = false;
        int lastDigit = 0;
        int rev = 0;
        int temp = originalNum;
        while (temp != 0) {
            lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp = temp / 10;
        }
        if (rev == originalNum) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int originalNum = sc.nextInt();

        System.out.println(Q45.checkPalindrome(originalNum) ? "Its a palindrome " : "Not a Palindrome");
        sc.close();
    }
}
