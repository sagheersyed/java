package collectionframework.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {
    
    public static void main(String[] args) {
        Set<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(10);
        linkedSet.add(-5);
        linkedSet.add(100);
        System.out.println(linkedSet);
    }
}
