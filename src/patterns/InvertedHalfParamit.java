package patterns;

public class InvertedHalfParamit {
    public static void main(String[] args) {
        int n = 4;
        int dec = 4;
        int inc = 5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++) {
                System.out.print('*');
            }
            --dec;
            inc++;
            System.out.println(dec + "     " + inc);
        }
    }
}
