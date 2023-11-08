package data_structure.recursion;

public class Recursion {
    static int sum = 0;
    public static void printSumOfNNaturalNos(int n) {
        if(n == 11) {
            System.out.println("function is terminated!");
            return;
        }
        sum+=n;
        System.out.println(sum);
        printSumOfNNaturalNos(n+1);
    }
    public static void main(String[] args) {
        printSumOfNNaturalNos(1);
    }
}
