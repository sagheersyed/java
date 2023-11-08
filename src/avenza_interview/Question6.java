package avenza_interview;

public class Question6 {
    public static void main(String[] args) {
        Child child = new Child();
        AbstractChild abs = new AbstractChild();
    }
}

class Person {
    int id;
    String name;

    public Person() {
        System.out.println("parent constructor!");
    }

}

class Child extends Person {
    public Child() {
        System.out.println("child constructor");
    }
}

abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("Abstract Constructor");
    }
}

class AbstractChild extends AbstractClass {
    public AbstractChild() {
        System.out.println("Abstract Child Constructor");
    }
}