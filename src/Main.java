class Main {
    int a = 10;
    int b = 20;
    public int sumTwoNumbers(int a , int b) {
        if(a < 0 || b < 0) {
            IllegalArgumentException e = new IllegalArgumentException();
            System.out.println(e);
            return -1;
        }
        else {
            return a + b;
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        int sum = m.sumTwoNumbers(-1 , 2);
        System.out.println(sum);
        System.out.println("hello world");
    }
}