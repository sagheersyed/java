package abstraction;

import java.util.ArrayList;

public class CarInterface {
    public static void main(String[] args) {
        Audi audi1 = new Audi();
        audi1.price = 20000;
        audi1.breaks();
        audi1.details();

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.add("shahab");
        newArrayList.add("rohaan");
        newArrayList.add("zubair");
        newArrayList.add("hamza");

        System.out.println(arrayList.size());

        arrayList.add("sagheer"); // time complexity O(1)
        arrayList.add("wajid");
        arrayList.add("bashar");
        arrayList.add(0, "ameer syed"); // time complexity O(n)

        System.out.println(arrayList);
        
        arrayList.addAll(newArrayList);
        
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        arrayList.set(3, "shahab syed");  // time complexity 1
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println( arrayList.contains("ameer syed!")); // time complexity 0(n)
        // jb kabhi bhi hm kisi object ko sout ka andar print karte hain tu woh toString() method ko invoke kar daita hai.
    }
} 

class Audi implements Car {
    String CAR_NAME = "AUDI";
    int price;
    @Override
    public void start() {
        System.out.println(CAR_NAME + " is start now!");
    }

    @Override
    public void breaks() {
        System.out.println(CAR_NAME + " is paddling breaks");
    }

    @Override
    public void accelarate() {
        System.out.println(CAR_NAME + " is accelarating speed");
    }

    @Override
    public void details() {
        System.out.println("the price of " + CAR_NAME + " is USD $" + price + "!");
    }

    @Override
    public void reverse() {
        System.out.println(CAR_NAME + " is going reverse!");
    }
}

interface Car {
    void start();
    void breaks();
    void accelarate();
    void details();
    void reverse();

}