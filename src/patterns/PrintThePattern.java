package patterns;

/**

    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

 */

 /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1 

    */
    
public class PrintThePattern {
    
   
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    // if the result is even then we will print 1
                    System.out.print(1 + " ");
                }
                else {
                    // if the result is odd then we will print 0
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
    
}