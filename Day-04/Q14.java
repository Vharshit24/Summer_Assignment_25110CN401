
// To find nth term of a fibonacci series.
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int num1 = 0, num2= 1;
        for(int i = 1; i<n;i++){
           int f = num1 + num2;
            num1 = num2;
            num2 = f;
        }  
         System.out.println(num1);

        sc.close();
    }
}
