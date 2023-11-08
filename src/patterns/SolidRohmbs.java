package patterns;

public class SolidRohmbs {
    public static void main(String[] args) {
        int n=5;
        // int m = 9;
        // int space = 0;
        for(int i = 1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
