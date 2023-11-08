package patterns;
/*
    - - -*
    - -* *
    -* * *
   * * * *
 */
public class Inverted180DegHalfParamid {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n; i++){
            int space = n - i;
            // System.out.print(space);
            for(int j=1; j<= n; j++){
                if(space >= j) {
                    System.out.print(' ');
                }
                else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}
