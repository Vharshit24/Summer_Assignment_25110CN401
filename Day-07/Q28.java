// Write a program to Recursive reverse number.

import java.util.*;
public class Q28 {
   static int rev= 0;
    public static int reverse(int x){
        
       if (x==0) {
        return rev;
       }
       if (x>0) {
        int temp= x%10;
        rev= rev*10 + temp;
        reverse(x/10);
       }
       return rev;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int reverse= reverse(n);
        System.out.println(reverse);
        sc.close();
    }
}
