
// Write a program to Print character triangle.
import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        for(int i= 1; i<= n; i++){
            char alpha = 'A';
            for(int j= 1; j<= i; j++){
                System.out.print(alpha);
                alpha += 1;
            }
            System.out.println();
        }

     sc.close();
    }
}
