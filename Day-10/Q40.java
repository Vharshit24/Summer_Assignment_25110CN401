// Write a program to Print character pyramid
import java.util.Scanner;
public class Q40 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int n= sc.nextInt();
        for(int i= 1; i<= n; i++){

            // char alpha= 'A';

            for(int s= 1; s<= n-i; s++){
                System.out.print(" ");
            }
            for(char j=65; j< 65+i; j++ ){       // Using Ascii values.
                System.out.print(j);
            }
            for(char k= (char)(65+i-2); k>= 65; k--){
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
}
