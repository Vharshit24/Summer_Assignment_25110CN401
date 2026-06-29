// Write a program to Find sum and average of array.

import java.util.*;
public class Q50 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        System.out.println("Enter values");
        int arr[]= new int[n]; 
        // Taking Input 
        for(int i= 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        float sum= 0;
        for(int j= 0; j< n; j++){
            sum+= arr[j];
        }
        System.out.println("sum= "+sum);
        float avg= sum/n;
        System.out.println("Average= "+ avg);

        sc.close();
    }
}
