//to check whether a given number is perfect or not.
import java.util.Scanner;
public class Q17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1; i<n;i++){ 
            if (n%i==0) {
                sum = sum + i;
            }
        }
        if (n==sum) {
            System.out.println("Given number is a perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
     sc.close();
    }
    
}
