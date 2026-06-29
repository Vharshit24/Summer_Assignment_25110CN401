// Write a program to Second largest element.
import java.util.Arrays;
public class Q55 {
    public static int secondLargest(int a[]){
        Arrays.sort(a);
        int size= a.length;
        int largest= a[size-1];
        for(int i= size-1; i>= 0; i--){
            if (largest!= a[i]) {
                return a[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {23,56,5,56,7};
        int index= secondLargest(arr);
       if (index== -1) {
        System.out.println("Second largest element does not exist");
       }
       else{
         System.out.println("Second largest element is: "+index);
       }

    }
}
