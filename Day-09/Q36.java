// Write a program to Print hollow square pattern.

public class Q36 {

    public static void main(String[] args) {
        //    "METHOD 1"
       
       for (int i = 1; i <= 5; i++) {  
            if (i == 1 || i == 5) {
            for (int j = 1; j <= 5; j++) {
                
                    System.out.print("* ");
                }
            }
            if (i >= 2 && i <= 4) {
                for (int k = 1; k <= 5; k++) {
                    if (k == 1 || k == 5) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }

        //        METHOD-2    
        // for(int i= 1; i<= 6; i++){
        //     for(int j= 1; j<= 6; j++){
        //         if (i== 1 || i== 6| j==1 || j==6) {
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }         
                 
    }
}
