package patterns;

/*
     1
     2  3
     4  5  6
     7  8  9  10
     11 12 13 14 15        
 */
public class FloyidTriangle { 
    public static void main(String[] args) {
        int n = 5;
        int inc = 0;
        for(int i=1; i<=n; i++){ // 3 <= 5; inc = 3;
            for(int j=1; j<=i; j++){ // i =3; j=3; 
                System.out.print(inc+ "  ");
                inc++;               // inc = 6;
            }
            System.out.println();
        }
    }
}
