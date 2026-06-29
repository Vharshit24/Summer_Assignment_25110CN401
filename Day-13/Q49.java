// Write a program to Input and display array
import java.util.*;
public class Q49 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        System.out.println("Enter values");
        int arr[]= new int[n]; 
        // taking input

        for(int i= 0; i<n; i++){
            arr[i]= sc.nextInt();

        }
        System.out.println("Printing array");
        for(int j= 0; j< n; j++){
            System.out.println(arr[j]);
        }
        sc.close();
    }
}
