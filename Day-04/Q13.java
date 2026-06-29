// To generate fibonacci series.
import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int num1 = 0, num2= 1, f ;
        for(int i = 1; i<=n;i++){
            System.out.print(num1);
            System.out.print(" ");
            f = num1 + num2;
            num1 = num2;
            num2 = f;
        }      
        
     sc.close();
    }
}
