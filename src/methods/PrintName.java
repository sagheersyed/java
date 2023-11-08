package methods;

public class PrintName {
    // fatorial of n! => 4! => 4 * (4-1=>3)! * (4-2=>2)! * (4-3=>1)! * (4-4=>0)! => note if n! > 0 
    public static long findFactorial(int n) {
        long factorial = 1;
        if(n < 1) {
            System.out.println("Invalid Number");
            // return;
        }
        for(int i = n; i > 0; i-- ) {
            factorial *= i;
            System.out.println(factorial);
        }
        return factorial;
    }
    public static void main(String[] args) {
    }
}
