// Write a program to Write function for Fibonacci.
import java.util.*;
public class Q47 {
    public static void fibonacci(int n){
        int num1= 0, num2= 1;
        for(int i= 1; i<= n; i++){
            System.out.print(num1+" ");
            int fibo= num1 + num2;
            num1= num2;
            num2= fibo;       
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println("Fibonacci series in the given range:");
        Q47.fibonacci(n);
        sc.close();
    }
}
