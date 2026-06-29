// To check given number is a strong number.
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int temp = n;
        int digit;
        int sum = 0;
        while (temp != 0) {
            digit = temp % 10;
            int fact = 1; // resetting the fact to 1 everytime for each digit.
            for (int i = 1; i <= digit; i++){
                fact = fact * i;
            }
            sum = sum + fact;
            temp= temp/10;

        }
        if (n == sum) {
            System.out.println(n+" is a Strong number");
        }
        else{
            System.out.println(n+" is Not a strong number");
        }
    sc.close();
   }

}
