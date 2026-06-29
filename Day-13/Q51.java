
// Write a program to Find largest and smallest element.
import java.util.Scanner;

public class Q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int min= arr[0];
        int max= arr[0];
        for(int i= 0; i< size; i++){
            if (arr[i]< min) {
            min= arr[i];
        }
        if (arr[i]> max) {
            max= arr[i];
        }
        }
        System.out.println("Min value: "+min);
        System.out.println("Max value: "+max);
        sc.close();
    }
}
