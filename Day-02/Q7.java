// To find product of digits
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n= sc.nextInt();
        int digit = 0;
        int product = 1;
        while (n!=0) {
            digit = n%10;
            product = product*digit;
            n = n/10;
        }
        System.out.println("Product of digits: "+product);


        sc.close();
    }
    
}
