import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        final int a = 10;
//        a = 20;
        if(x > y) {
            int c = 'a';
            System.out.println("x is greater");
        }
        else if(x < y){
            System.out.println("x is lesser");
        }
        else {
            System.out.println("x and y is equal");
        }
        System.out.println();

    }
}
