// To check a number is palindrome
import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int originalNum = sc.nextInt();
        int temp=originalNum;
        int rev=0,digit=0;
        while(temp!=0){
            digit = temp%10;
            rev = rev * 10 + digit;
            temp/=10;  //num=num/10;

        }
        // if(originalNum==rev) System.out.println("The number is a palindrome.");
        // else System.out.println("The number is not a palindrome.");

       System.out.println(originalNum==rev ? "Palindrome" : "Not Palindrome");
        
        sc.close();
    }
}
