package collectionframework.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkLists {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("sagheer"); // this is a peek element in queue linklist. takes operation first in first out. 
        q.offer("wajid");
        q.offer("bashar");
        q.offer("hajra");
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        q.poll();
        q.poll();
        q.poll(); //  when we removing element from queue data structure if a queue is empty it will return false or null
        // q.remove(); // but when we removing element from queue data structure if a queue is empty it will throw an exception java.util.NoSuchElementException
        System.out.println(q);

    }
}
