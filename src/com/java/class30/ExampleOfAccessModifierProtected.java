package com.java.class30;

import com.java.class31.Bank1;

public class ExampleOfAccessModifierProtected extends Bank1 {
    public static void main(String[] args) {
        Bank1 b = new Bank1();
        //System.out.println(b.balance);
        System.out.println(b.accName);
        //System.out.println(b.accNUmber);
        System.out.println(b.nomineeDetails);
    }

}
