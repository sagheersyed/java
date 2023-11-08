package collectionframework.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<Integer> hashSets = new HashSet<>(); // hashset data structure ka element ka order random hota hai matlab hm jis order mein elements add karte hain woh us order mein nhi milte.
        // set data structure mein hamara elements ka sb sa pehle hashcode banta hai or us ka baad hamara data sturucture yeah dakhta hai ka is hashcode ka element pehle sa tu hamara pass bhi parha agr woh use mil jata hai tu woh ise memory mein add nhi kara.
        hashSets.add(10);
        hashSets.add(-10);
        hashSets.add(5);
        hashSets.add(40);
        System.out.println(hashSets);
    }
    
}
