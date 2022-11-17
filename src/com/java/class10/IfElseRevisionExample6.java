package com.java.class10;
// Find output of the below program
public class IfElseRevisionExample6 {
    public static void main(String[] args) {
//        int i=20, j=50;
//
//        if(i <= 10 && j > i || j<=i){
//            j = j + 30; //
//        }else{
//            i = i + 30; //
//        }
//
//        if(i > j){
//            i = i + j;  //
//        }else{
//            j = i + j; //
//        }
//
//        System.out.println(i); //50
//        System.out.println(j); //100

        int a = 3, b = 4, c = 6;

        if (a > b && c < b){ // 3 > 4 false going to next condition
            System.out.println(a);
        }else if(b > a || b > c ) {  // 4 > 3 true
            b = a + c;                // assigning new value to b =9
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    } /// Answer will be 9
}