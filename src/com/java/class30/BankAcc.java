package com.java.class30;

class Bank {
    void displayRateOfInterest(){
        System.out.println("4%");
    }
}
class ChaseBank extends Bank{
    void displayRateOfInterest(){
        System.out.println("6%");
    }


}
class BankOfAmerica extends Bank{
    void displayRateOfInterest(){
        System.out.println("3%");
    }

}
class CitiBank extends Bank{
    void displayRateOfInterest(){
        System.out.println("5%");
    }

}

public class BankAcc{
    public static void main(String[] args) {
        Bank b = new Bank();
        b.displayRateOfInterest();
        ChaseBank c = new ChaseBank();
        c.displayRateOfInterest();
        CitiBank ct = new CitiBank();
        ct.displayRateOfInterest();
    }
}