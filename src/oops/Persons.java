package oops;

// import encapsulation.EncapsulationMain;

public class Persons {
    int id;
    String name;
    String email;
    static int count;

    Persons() {
        ++count;
        System.out.println("number of object are created from Person Prototype : " + count);
    }

    Persons(int PersonId , String PersonName , String PersonEmail) {
        this();
        id = PersonId;
        this.email = PersonEmail;
        name = PersonName;
    }

    public void eat() {
        System.out.println(this.name + " is eating!");
    }

    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }

    public void walk() {
        System.out.println(this.name + " is walking");
    }

    public void run() {
        System.out.println(this.name + " is running");
    }

    public void personDetails() {
        System.out.println("Name: " + this.name + "\nEmail : " + this.email);
    }

    public static void main(String[] args){
        // non-parametrized constructor
        Persons p1 = new Persons();
        p1.name = "sagheer";
        p1.id = 111;
        p1.email = "sagheer@gmail.com";

        p1.eat();
        p1.sleep();
        p1.personDetails();
        p1.run();


        // parametrized constructor
        Persons p2 = new Persons(111 , "wajid" , "wajid@gmail.com");

        p2.eat();
        p2.sleep();
        p2.personDetails();
        p2.walk();

        // EncapsulationMain enc = new EncapsulationMain();
        // enc.printName();

    }

}
