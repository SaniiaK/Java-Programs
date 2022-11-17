package com.java.Practice;

public class Pattern1 {
    public static void main(String[] args) {
//        for ( int i = 1; i <=5; i++) {
//            for (int j = 1; j <= 5+1-i; j++) {
//
//                System.out.print("6 ");
//            }
//
//            System.out.println();
//        }

        for ( int b = 1; b <=4; b++){
            for ( int c =1; c <= b ; c++){
                System.out.print(" ");
            }
            for ( int w =1; w <=4*2-b; w++){

                System.out.print("*");

            }
            System.out.println();
        }

}
}
