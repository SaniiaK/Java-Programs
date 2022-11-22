package com.java.class28;

public class Bank {
    String accName;
    int accNumber;
    int accBalance;

    public void withdraw(int accBalance, int amount){
        int withdraw = accBalance-amount;
        System.out.println("You withdrew $"+ amount + " your new balance is now $"+withdraw);
    }
}
class AdvancedBank extends Bank {

    public void addMoney(int accBalance, int amount){
        int newBalance = accBalance+amount;
        System.out.println("You added $"+amount+ " and your balance is now " + newBalance);
    }
}
