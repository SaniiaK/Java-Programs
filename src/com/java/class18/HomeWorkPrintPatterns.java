package com.java.class18;

public class HomeWorkPrintPatterns {
    public static void main(String[] args) {
        for ( int a =1; a<=5; a++){
            for ( int b=1; b <=a; b++){
                System.out.print(b +" ");
            }
            System.out.println();
        }

        System.out.println();


        for(int i=1; i<=5; i++){
            for (int j=i; j<=5; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        for ( int b =1; b<=5; b++) {
            for ( int d =1; d <=b; d++){
                System.out.print("  ");
            }
            for (int c = 1; c <=11-b*2; c++) {
                System.out.print(c +" ");
            }
            for ( int e=b; e<=5; e++){
                System.out.print("  ");
            }

            System.out.println();

        }
        System.out.println();


        for ( int q = 1; q <= 5; q++){
            for ( int w = q; w < 5 ; w++){
                System.out.print("  ");
            }
            for ( int e = 1; e <= q * 2 - 1; e++){
                System.out.print(e + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int r =1; r <=5; r++) {
            for (int sp = 1; sp <= 5 - r; sp++) {
                System.out.print(" ");
            }

            for (int t = 1; t <= r * 2 - 1; t++) {

                System.out.print(t);
            }
            System.out.println();
        }

        for ( int p =1; p<=4; p++){
                for ( int o = 1; o <=p; o++){
                    System.out.print(" ");

                }
                for ( int s =1; s <= 9-p*2; s++){
                    System.out.print(s);

                }
                System.out.println();


        }

        System.out.println();

/// Upper triangle
        for ( int line =1; line <=5; line++) {

            for (int space = line; space <= 5 - 1; space++) {
                System.out.print(" ");

            }
            for (int colum = 1; colum <= line * 2 - 1; colum++) {

                    System.out.print(line%2);

            }
            System.out.println();
        }

// Lower Triangle
       for ( int line2=1; line2 <=4; line2++){
                for ( int space2 =1; space2<=line2; space2++)
                    System.out.print(" ");

            for ( int colum2=1; colum2<=9-line2*2; colum2++){

                    System.out.print((line2 +1)%2);


            }
            System.out.println();
        }


    }
}
