package collectionframework.collections.queue;
import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 
        pq.offer(-5);
        pq.offer(40);
        pq.offer(5);
        pq.offer(1);
        pq.offer(100);
        pq.offer(55);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
