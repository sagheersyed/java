public class PreVsPostIncrement {
    // pre increment mein pehle value change hoti hai or us ka baad value assign/use hoti hai.
    // post increment mein pehle value assign/use hoti hai or us ka baad value change hoti hai.
    // ex: 
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        // int c = 0;
        // post-increment
        b = a++; // is operation mein pehle value assign ho gi or us ka baad increment ho ga "a" mein.
        System.out.println("the value of a: " + a);
        System.out.println("the value of b: " + b);

        // pre-increment
        // c = ++a;
    }
}
