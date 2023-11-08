package avenza_interview;

public class Question5 {

    public static void main(String[] args) {
        A a = new A();
        a.print();

        B b = new B();
        b.print();

        A ab = new B();
        ab.print();

        // B ba = new A();
        // ba.print();

        B aba =(B) new A();
        aba.print();
    }
    
}

class A {
    public void print(){
        System.out.println("A");
    }
}

class B extends A{
    @Override
    public void print() {
        System.out.println("B");
    }
}
