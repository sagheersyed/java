package oops;


class Person {
    int personId;
    String personName;
    String personEmail;
    int personAge;
    static int noOfObjectsGenerated;
    String personNationality;

    Person() {
        noOfObjectsGenerated++;
        System.out.println("Object are created : " + noOfObjectsGenerated);
    }

    Person(int id , String name , String email , int age , String nationality) {
        this.personId = id;
        this.personName = name;
        this.personEmail = email;
        this.personAge = age;
        this.personNationality = nationality;
        System.out.println("Object are created : " + noOfObjectsGenerated);
    }

    Person(int id , String name , String email) {
        noOfObjectsGenerated++;
        this.personId = id;
        this.personName = name;
        this.personEmail = email;
        System.out.println("Object are created : " + noOfObjectsGenerated);
    }
}

public class ConceptsPractice {
    public static void main(String[] args) {
        // Person person1 = new Person(111 , "sagheer" , "sagheer@gmail.com");
        Persons person2 = new Persons();
        person2.id = 112;
        person2.name = "wajid";
        person2.email = "wajid@gmail.com";
    }
}
