/**
 * Loops
 */
public class Loops {
    static int table = 10;
    public static void main(String[] args) {
        // for loop 
        // for(int i=1; i<=10; i++) {
        //     System.out.println(table + "*" + i + "=" + table * i);
        // }

        // int i=0;
        // while loop
        // while(i<=10) {
        //     System.out.println(i);
        //     i+=2;
        // }

        // int i=0;
        // // do while loop 
        // do {
        //     System.out.println(i);
        //     i++;
        // }while(i<=10);

        // practice
        // print the sum of first n natural numbers.
        int n = 4;
        int sum = 0;
        for(int i=1; i<= n; i++){
            sum += i; 
            System.out.println(sum);
        }
    }
}