package com.java.class19;

public class RevisionHomeWork {
    public static void main(String[] args) {
        /// Write a program to print all the prime numbers from 1-100

         for (int num =1; num<=100; num++){
             if (isPrime (num)==true){
                 System.out.println(num);
             }
         }
        for (int num =11; num<=100; num++){
            if (isPrime(num) ==true){
                System.out.println(num);
            }
        }

    }
    static boolean isPrime( int num){
        int count =0;

        for ( int i =1; i <=num; i++ ){ // if u want to include number 1 and divisible by 1 than  we do i =1; i<=num
            if (num % i == 0){
                count++;
            }
        }
        if (count ==2){ // count ==2
            return true;
        }else {
            return false;
        }
    }

    static boolean IsPalindrome ( int num){
        int rev=0;
        int rev_num=num;


        while ( rev_num >0){
            rev= rev*10 + rev_num %10;
            rev_num = rev_num / 10;
        }
        if (num == rev){
            return true;
        }else{
            return false;
        }
    }

}
