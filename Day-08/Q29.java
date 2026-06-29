// Write a program to Print half pyramid pattern.
import java.util.*;
public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n = sc.nextInt();
        for(int i=1;i<=n; i++ ){           // To print new line after each iteration.
            for(int j = 1; j<=i;j++){      // To print no of star equal to row.
                System.out.print("*");
            }
            System.out.println("");
        }
    sc.close();   
    }
    
}
