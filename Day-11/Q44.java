// Write a program to Write function to find factorial.

import java.util.Scanner;

public class Q44 {
    public static int factorial(int n){
        int fact= 1;
        for(int i= 1; i<= n; i++){
            fact*=i; 
        }      
        return fact;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();     
        System.out.println("Factorial of "+n+": "+ Q44.factorial(n));
        sc.close();
    }
}
