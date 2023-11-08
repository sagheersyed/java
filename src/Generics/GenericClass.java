package Generics;

/* 
    Java Generics allows us to create a single class, interface, and method that can be used with different types of data (objects).
    This helps us to reuse our code.
    Note: Generics does not work with primitive types (int, float, char, etc).

    We can create a class that can be used with any type of data. Such a class is known as Generics Class.
*/


class Generic<T> {
    private T t;

    public T getData() {
        return this.t;
    }

    Generic(T t) {
        this.t = t;
    }
}


public class GenericClass {
    public static void main(String[] args) {
        Generic<String> g = new Generic("sagheer");
        System.out.println(g.getData());

        Generic<Integer> g1 = new Generic("s");
        System.out.println(g1.getData().getClass().getName());
    }
    
}