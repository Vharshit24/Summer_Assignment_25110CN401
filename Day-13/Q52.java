
// Write a program to Find largest and smallest element.
import java.util.Scanner;

public class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count= 0;
        for(int i= 0; i< size; i++){
            if ((arr[i] & 1) == 0) {
                count+= 1;
            }
        }
        System.out.println("No. of even values: "+count);
        System.out.println("No. of odd values: "+(size-count));
        
        sc.close();
    }
}

