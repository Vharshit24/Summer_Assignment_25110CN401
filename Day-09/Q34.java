// Write a program to Print reverse number triangle.
import java.util.Scanner;
public class Q34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        for(int i= n; i>=1; i--){
            // int count = 0;
            for(int j= 1; j<= i; j++){
                // count+= 1;
            System.out.print(j);
            }
           System.out.println();     
        }
        sc.close();
    }
}
