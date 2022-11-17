package com.java.Practice;

public class ConditionIsRainy {
    public static void main(String[] args){

        boolean isRainy = false;
        boolean hasUmbrella = true;
        boolean isSunny = true;
        if (isRainy == true && hasUmbrella ==true) {
            System.out.println("Take your umbrella");
        }else if (isRainy == true || hasUmbrella == true) {
            System.out.println("It's either raining, or you have umbrella, or both");
        }else if ( hasUmbrella == true || isSunny == true)
            System.out.println("It is sunny and not raining");
        }
    }

