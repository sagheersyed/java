package collectionframework.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(-5);
        treeSet.add(-10);
        treeSet.add(1000);
        treeSet.add(0);
        System.out.println(treeSet);
        treeSet.remove(10);
        System.out.println(treeSet);
    }
}
