package com.java.class43;

import java.util.HashMap;
import java.util.Map;

enum InputField {
    AMOUNT, FROM_ACCOUNT, TO_ACCOUNT, NOTE;

}

public class EnumExample {

    public static void main(String[] args) {
        System.out.println("Opening Website");
        Map<String, String> dataOnInput = enterDetailsAndClickOnContinue();
        Map<String, String> dataOnReview = getDataOnReviewPage();


    }

    public static Map<String, String> getDataOnReviewPage() {
        String fromAcc = "453-234-457-343";
        String toAcc = "3453-34545-234354";
        int amount = 2000;
        String note = "Salary Payment";


        Map<String, String> dataOnReviewPage = new HashMap<>();

        dataOnReviewPage.put(InputField.FROM_ACCOUNT.toString(), fromAcc); // hard coding "from account"
        dataOnReviewPage.put(InputField.TO_ACCOUNT.toString(), toAcc);
        dataOnReviewPage.put(InputField.AMOUNT.toString(), String.valueOf(amount));
        dataOnReviewPage.put(InputField.NOTE.toString(), note);
        return dataOnReviewPage;
    }


    public static Map<String, String> enterDetailsAndClickOnContinue() {
        String fromAcc = "453-234-457-343";
        String toAcc = " 3453-34545-234354";
        int amount = 2000;

        String note = "Salary Payment";

        System.out.println("Entering from account " + fromAcc);
        System.out.println("Entering to account " + toAcc);
        System.out.println("Entering note " + note);
        System.out.println("Continue button");


        Map<String, String> dataOnInput = new HashMap<>();
        dataOnInput.put("from account", fromAcc);
        dataOnInput.put("to account", toAcc);
        dataOnInput.put("amount", String.valueOf(amount));
        dataOnInput.put("note", note);
        return dataOnInput;

    }
}
