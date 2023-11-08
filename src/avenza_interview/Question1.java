package avenza_interview;

public class Question1 {
    
    public static void main(String[] args) {
        final Persons person = new Persons();
        person.setPrice(100);
        person = new Persons(); // this will throw an exception.
        System.out.println(person.getPrice());
    }
    

}

class Persons {
    private int price;
    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Persons(int price) {
        this.price = price;
    }

    public Persons() {

    }

}
