// Write a program to Recursive Fibonacci.
import java.util.Scanner;
public class Q26 {
    public static int fibonacci(int x){
        if (x==0 ) {
            return 0;
        }
        else if (x==1) {
            return 1;
        }
       return fibonacci(x-1)+ fibonacci(x-2);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
}
