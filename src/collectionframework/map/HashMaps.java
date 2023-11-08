package collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String , String> hashMap = new HashMap<>();
        hashMap.put("pak", "Pakistan");
        hashMap.put("pls", "Palestine");
        hashMap.put("chi", "China");
        hashMap.put("bang", "Bangladesh");
        hashMap.putIfAbsent("chi", "West China");
        System.out.println(hashMap);
        hashMap.remove("chi");
        System.out.println(hashMap);

        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println(entry);
        }

        for (String keys : hashMap.keySet()) {
            System.out.println(keys);
        }

        for (String values : hashMap.values()) {
            System.out.println(values);
        }
        
        hashMap.clear();
        System.out.println(hashMap);

    }
}
