package com.java.class31;

public class BankMainClass {
    public static void main(String[] args) {
        ChaseBank saniiaAccCB = new ChaseBank();
        BankOfAmerica saniiaBOA = new BankOfAmerica();
        WellsFargo saniiawf = new WellsFargo();

        saniiaAccCB.displayRateOfInterest();
        saniiaAccCB.checkBalance();


        saniiaBOA.displayRateOfInterest();
        saniiaBOA.checkBalance();


        PayPal pp = new PayPal();
        pp.checkBalance(saniiaAccCB);
        pp.checkBalance(saniiaBOA);
        pp.checkBalance(saniiawf);
    }
}
