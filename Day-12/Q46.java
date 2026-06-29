// Write a program to Write function for Armstrong.
import java.util.*;
public class Q46 {
    public static int armstrong(int originalNum) {
        int temp1 = originalNum;
        int temp2 = originalNum;
        int  count = 0;
        while (temp1 != 0) {
            temp1 = temp1 / 10;
            count += 1; 
        }
        int arm = 0;
        while (temp2 != 0) {
            int lastDigit = temp2 % 10;
            arm = arm + (int) Math.pow(lastDigit, count);
            temp2 = temp2 / 10;
        }
        return arm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int originalNum = sc.nextInt();
        if (originalNum== Q46.armstrong(originalNum)) {
            System.out.println("Given number is an Armstrong Number");
        }
        else{
            System.out.println("Given number is not an Armstrong Number");
        }
        sc.close();
    }
}
