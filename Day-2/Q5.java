// To find sum of digits of number.
import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int sum = 0;
        int digit = 0;
        while (n!=0) {
            digit= n%10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println("Sum of digits: "+sum);

        sc.close();
    }
}
