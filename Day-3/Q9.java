// "To check whether a given number is prime or not"
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num<=1) {
            System.out.println("Enter value greater than 1");
             
            
        }
        int i;
        for(i = 2;i<num;i++){
            if (num%i==0) {
                //number is divisible
                System.out.println("Given number is not prime");
                break;
            }
            
        } 
        if(i==num)System.out.println("prime");
        
        sc.close();     
    }
    
}
