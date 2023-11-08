package avenza_interview;

public class Question2 {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.recursive();
    }
}

class Recursion {
    public void recursive() {
        recursive();
    }
}