package patterns;

public class ButterFlyPattern {
    public static void main(String[] args) {
        int n = 4;
        int space = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                space = n-i;
                if(space >= j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            for(int j=1; j<=n; j++) {
                space = n-i; // => space = 3  
                if(space >= j){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();
        
        }
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n; j++){
                if(i>=j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            for(int j=1; j<=n; j++) {
                space = n-i; // => space = 3  
                if(space >= j){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
