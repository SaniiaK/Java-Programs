package com.java.class27;



class Bank {
    int balance =40;

    public void method1 (){
        String balance = "40";
        System.out.println(balance);
    }
}
public class TypesOfVariables {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.method1();
        System.out.println(b.balance);
    }
}
