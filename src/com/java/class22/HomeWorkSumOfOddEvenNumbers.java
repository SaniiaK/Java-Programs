package com.java.class22;

public class HomeWorkSumOfOddEvenNumbers {
    // ============= Homework 08 Nov =============
    //   1. Write a program to find the sum of even and odd numbers
    //Example
    //Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
    //Output : Sum Of Even - 134, Sum Of Odd - 171
    //  2. Write a program to find the greatest number from an array
    //Example
    //Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
    //Output : Maximum - 75
    //  3. Write a program to find all duplicates number from the array (Tricky, do enough brainstorming before solving)
    //Example
    //Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
    //Output : Duplicate numbers - 23, 44

    public static void main(String[] args) {

        int data []= {23, 44, 21, 56, 27, 35, 75, 44, 25};
        int greatestNumber=0;
        int duplicateNum=0;
        int sumOfEven=0;
        int sumOfOdd=0;
        sumOfOddAndEvenNumbers(data,sumOfEven,sumOfOdd);
        System.out.println("The greatest number in array is: " + greatestNumberInArray(data,greatestNumber));
        findDuplicateNumber(data);

    }
    static void sumOfOddAndEvenNumbers (int []data, int sumOdd, int sumEven) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 0) {
                sumEven = sumEven + data[i];

            } else if (data[i] % 2 != 0) {
                sumOdd = sumOdd + data[i];
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);

    }

   static int greatestNumberInArray (int numbers[], int greatestNum) {
       for (int a = 0; a < numbers.length; a++) {
           if (numbers[a]>greatestNum){
               greatestNum=numbers[a];
           }
       }

       return greatestNum;
   }

     static void findDuplicateNumber (int [] numbs){
        for ( int j = 0; j < numbs.length-1; j ++){
            for ( int k = j-1; k < numbs.length; k ++){
                if (numbs[j]==numbs[k]){
                    System.out.print(numbs[k] + ", ");
                }
            }
        }

    }
}
