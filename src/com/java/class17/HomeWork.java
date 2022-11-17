package com.java.class17;

public class HomeWork {
    public static void main(String[] args) {
        for ( int i =1; i <=5; i++){
            for ( int j=1; j <=5-i; j++){
                System.out.print(" ");
            }
            for ( int a =1; a <=i*2-1; a++){
                System.out.print("*");
            }
            System.out.println();
        }
        for ( int j = 4; j >=1; j--){
            for ( int c =1; c <= 5-j ; c++){
                System.out.print(" ");
            }
            for ( int w =1; w <=j*2-1; w++){

                System.out.print("*");

            }
            System.out.println();
        }
    }
}

