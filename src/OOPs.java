// java aik high level language hai jis ka kaam code ko high level language sa native code mein convert karna hai q ka hamari machine sirf binary code samajti hai 0 1 tu hamri machine mein aik compiler hota hai jo hamra code ko bytecode mein convert karta hai us ka baad jvm(java virtual machine) us ko native code mein convert karta hai jis sa hamra cpu use samj pata hai.

// java aik platform independent language hai jise hm kisi bhi operating system pr chala sakte hain. 

// code ka zarya hm apne machine ko step by step instruction daita hain.

// java ki har file mein hamara pass sirf aik public class ho gi jo harami file ki main class hain jahan pr hamara objects create hon ga or hamara program run/execute ho ga.

// classes hamra java mein blue prints hain jahan pr hamra objects ka blues prints define hote hain yani unki properties/data , functions/behaviours.

// constructors java mein special methods hote hain jinka kaam hamara liye object bnana hota hai. constructor kabhi bhi kuch bhi return nhi karte.
// java mein 3 kisam ka constructor hote hain. constructor ko sirf 1 martaba hi call kia ja sakta hai.

// non-parametrized constructor , parametrized constructor , copy constructor

// new keyword ka kaam hamara heap memory mein aik jaga create ho jae gi jahan pr hamra pura object store ho jae ga.

// java mein agr hmain koi object destroy karna ho tho java mein hamara pass aik garbage collector mechanism hai jis ka zarya hamra program yeah detect kar pata hai ka kn sa object ya data garbage hai tu woh use asani sa remove kar daita hai or iska liye hamein khud sa manuallay koi command bhi nhi daini parti. 

// constructor ka kaam objects ko create karna or garbage collector ka kaam faltu objects ko remove karna jaisa ka c++ mein harmara pass aik destructure method hota hai.

// this keyword sa hamara class ko yeah pata chalta hai ka kon sa data ya method kis object ko represent karte hain.


// java mein functions or methods block of code hota hain jo ka special tasks perform karte hain.

// java aik statically typed language hai jis ka matlab hai ka kisi bhi variable ko use karna sa pehle usey decalre kia jae ga.

// java mein 8 kism ka primitive data types hote hain.
// byte , short , int , float , decimal , long , boolean , char 
// non primitives : objects , arrays , string. Means they all are objects.


// oops ka core concept complex/bari problem ko chote chote object mein torna hai.

// object aik entity hai jis ki state or behaviour hota hai.
// object is an instance of a class.

// A class is a blueprint for the object. Before we create an object, we first need to define the class.

// We can think of the class as a sketch (prototype) of a house. It contains all the details about the floors, doors, windows, etc. Based on these descriptions we build the house. House is the object.

// Since many houses can be made from the same description, we can create many objects from a class.

// fields and methods are members of class.

// advantages of methods 
// The main advantage is code reusability. We can write a method once, and use it multiple times. We do not have to rewrite the entire code each time. Think of it as, "write once, reuse multiple times".

// The static keyword in Java is used to define members (variables and methods) that belong to a class rather than to an instance of the class. This means that you can access static members without creating an object of the class.
// Note: When a variable is declared as static, it is shared among all instances (objects) of the class. Static variables are often used to maintain common data or configuration values for all instances. example : when we want to know how many objects are created from that calss prototype. we can count it. 
// Static variables are commonly used to define constants in Java. These are often declared as final to indicate that their values cannot be changed.
// Constants are typically named in all uppercase letters.
//  static final int MAX_VALUE = 100;
// java mein tamaam classes ki parent class hamrari Object class hai.
public class OOPs {
    public static void main(String args[]) {
        Human human1 = new Human("zubair" , 22);
        human1.religion = "islam";
        human1.eat();
    }
}

class Human {
    String gender;
    int age;
    String name;
    String religion;

    Human(String name , int age) { // constructor
        System.out.println("name: " + name + "  age: " + age);
    }

    public void eat() {
        System.out.println("i am eating!");
    }
    
    public void run() {
        System.out.println("i am running");
    }

    public void sleep() {
        System.out.println("i am sleeping");
    }
}
