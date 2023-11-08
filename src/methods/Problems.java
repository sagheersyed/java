package methods;

import java.util.Scanner;

public class Problems {
    
    public static void findGreaterNumber(int a , int b) {
        if(a > b) {
            System.out.println(a + " a is greater than b " + b);
            return;
        }
        if(a < b) {
            System.out.println(b + " b is greater than a " + a);
            return;
        }

        if(a == b) {
            System.out.println("both a and b are equals " + a + " : " + b);
            return;
        }
    }
    
    public static void findElegiblility(int age) {
        if(age >= 18) {
            System.out.println("your are elegible");
            return;
        }
        else {
            System.out.println("you are not elegible");
        }
    }
    
    public static void countingNumbers() {
        
        Scanner sc = new Scanner(System.in);
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zerosNumber = 0;
        while (true) {
            System.out.println("Enter a number (or any non-number to stop): "2);
            if(sc.hasNextInt()) {
                int number = sc.nextInt();
                if(number > 0) {
                    positiveNumbers++;
                }
                else if(number < 0) {
                    negativeNumbers++;
                }
                else {
                    zerosNumber++;
                }
            }
            else {
                if(positiveNumbers > negativeNumbers && positiveNumbers > zerosNumber) {
                    System.out.println("positive numbers are greater");
                }
                else if(negativeNumbers > positiveNumbers && negativeNumbers > zerosNumber) {
                    System.out.println("negative numbers are greater");
                }
                else {
                    System.out.println("zero's numbers are greater");
                }
                System.out.println("the number of positive numbers is : " + positiveNumbers);
                System.out.println("the number of negative numbers is : " + negativeNumbers);
                System.out.println("the number of zero numbers is : " + zerosNumber);
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        countingNumbers();
    }
}
