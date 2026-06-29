// Write a program to Linear search
import java.util.Scanner;
    
public class Q53 {
    public static int linearSearch(int a[], int t){
        
         for(int i= 0; i< a.length; i++){
            if (a[i]== t) {
            return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter values");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter target");
        int target= sc.nextInt();
        int index= linearSearch(arr, target);

        if (index== -1) {
            System.out.println("Element not found in array");
        }
        else{
            System.out.println("Element found at Position: "+ (index+1));
        }
        sc.close();
    }
}

