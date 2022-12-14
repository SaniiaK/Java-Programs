package com.java.class31;

public class Bank1{
    private int balance;
    String accNUmber;
    public String accName;
    static protected String nomineeDetails;
}
class AmexBank extends Bank1{
    void method1(){
       // System.out.println(balance);
        System.out.println(accName);
        System.out.println(accNUmber);
        System.out.println(nomineeDetails);
    }

}




class MainEncapsulationExample {
    public static void main(String[] args) {

//        AmexBank amex = new AmexBank(1000);
//        amex.checkBalance();
//        amex.withdraw(500);
//        amex.checkBalance();
//        amex.balance = 100000000;

    }
}
