// Write a program to Print number pyramid.
import java.util.Scanner;
public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for(int d= i-1; d>= 1; d--){
                    System.out.print(d);
                }
                   System.out.println();
            }
         
            sc.close();
        }
        
    }

