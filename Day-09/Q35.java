// Write a program to Print repeated character pattern.
import java.util.*;
public class Q35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        char alpha= 65;              //Type casting
        for(int i= 1; i<= n; i++){
             
            for(int j= 1;j<= i; j++){
               System.out.print(alpha);
            }
            alpha++;
            System.out.println();
        }

     sc.close();   
    }
}
/* ABCDE
   ABCDE
   ABCDE
   ABCDE
   ABCDE */


 /*ABCDE
   ABCD
   ABC
   AB
   A
*/