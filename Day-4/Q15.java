
// To check Armstrong Number. 
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int temp1 = num;
        int count = 0;
        double sum = 0; 
        while (temp1 != 0) {       //to count no. of digits
            temp1 = temp1 / 10;   
            count = count + 1;
        }
        int temp2 = num;
        while (temp2 != 0) {
            int digit = temp2 % 10;
            sum = sum + Math.pow(digit, count);
            temp2 = temp2 / 10;

        }
        if (num == sum) {
            System.out.println(num + " is an ARMSTRONG Number");
        } else {
            System.out.println(num + " is not an ARMSTRONG Number");
        }

        sc.close();
    }
}
