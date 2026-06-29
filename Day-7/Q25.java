// Write a program to Recursive factorial
import java.util.Scanner;
public class Q25 {

    public static int factorial(int x){
        if (x==1) {
            return 1;
        }
       return x*factorial(x-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}
