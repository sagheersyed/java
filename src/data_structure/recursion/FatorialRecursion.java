package data_structure.recursion;

public class FatorialRecursion {
    public static void findFactorial(int n , int factorial) {
        if(n == 1) {
            return;
        }

        factorial = factorial * n;
        findFactorial(n-1, factorial);
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        findFactorial(7,1);
    }
}
