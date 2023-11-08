package encapsulations;

public class EncapsulationMain {
    int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void printName() {
        System.out.println(this.name + " is my name.");
    }
    public static void main(String[] args) {
        EncapsulationMain en = new EncapsulationMain();
        en.name = "wajid";
        en.printName();
        en.name = "ss";
    }
}
