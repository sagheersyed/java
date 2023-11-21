import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {
        // array deque aik aesa data structure hai jis mein hm queue ka start or end taraf element store or remove kar sakte hain is kuch apne defined funcitons jis ka zarya hamain in operations mein madad milti hai.
        // addFirst() , addLast() , removeFirst() , removeLast() , peekFirst() , peekLast()
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Two");
        arrayDeque.addFirst("One");
        arrayDeque.add("Three");
        arrayDeque.addLast("Four");

        System.out.println(arrayDeque);
        
        System.out.println("last peek element: " + arrayDeque.peekLast());
        System.out.println("first peek element: " + arrayDeque.peekFirst());
        System.out.println("peek element: " + arrayDeque.peek());
        arrayDeque.removeLast();
        
        System.out.println(arrayDeque);
    }
}
