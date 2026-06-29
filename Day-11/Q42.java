// To Write function to find maximum.

public class Q42 {
    public static int max(int a, int b) {
        int z = 0;
        if (a > b) {
            z = a;
        } else {
            z = b;
        }
        return z;

    }

    public static void main(String[] args) {
        int a = 9;
        int b = 8;

        System.out.println(Q42.max(a, b));

    }
}
