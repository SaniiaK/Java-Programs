package com.java.class28;

public class MainBank {

        public static void main(String[] args){
            Bank ac = new Bank();

            ac.withdraw(2000,500);


            AdvancedBank ac1 = new AdvancedBank();

            ac1.addMoney(2400,900);
            ac1.withdraw(2400, 500);



        }
    }

