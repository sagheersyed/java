package collectionframework.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkLists {
    public static void main(String[] args) {
        List<Integer> linklist = new LinkedList<>();
        linklist.add(1);
        linklist.add(5);
        linklist.add(10);
        System.out.println(linklist);
        
        System.out.println(linklist.get(1));
    }
}
