package abstraction;

public class CarAbstract {
    public static void main(String[] args) {
        Audi audi1 = new Audi();
        audi1.price = 20000;
        audi1.start();
        audi1.accelarate();
        audi1.reverse();
        audi1.details();
      }
}    
   
   class Audi extends CarAbs {
       @Override
       void start(){
           System.out.println("Audi is start!");
       }
       
       @Override
       void breaks() {
           System.out.println("Audi is stop!");
       }
       
       @Override
       void accelarate() {
           System.out.println("Audi speed is increasing!");
       }

    @Override
    void details() {
        System.out.println("The Price of a Audi Car is : $" + price);
    }
       
   }
   
    abstract class CarAbs {
       int price;
       int gares;
       abstract void start();
       
       abstract void breaks();
       
       abstract void accelarate();

       abstract void details();
       
       void reverse() {
           System.out.println("Car is going reverse!");
       }
   }
   