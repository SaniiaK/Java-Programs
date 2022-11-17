package com.java.class23;

public class HomeWorkTask3 {
    public static void main(String[] args) {
        //  3. Write a program to find all duplicates number from the array (Tricky, do enough brainstorm before solving)
        //Example
        //Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
        //Output : Duplicate numbers - 23, 44

        int data[]={23, 44, 21, 23, 23, 35, 35, 23, 23,  44, 35};
        int targetNumber=0;



        for ( int i =0; i <data.length-1; i++){
            for ( int j =i+1; j<data.length;j++){
                if (data[i]==data[j]){
                    targetNumber=data[i];





                    System.out.println("New data: " + data[i]);
                    //System.out.print(data[i]+ ", ");

                }
            }

        }

    }
    static boolean findDuplicateNumber(int data [], int targetNum){

        for (int i =0; i < data.length; i++){
            if (data[i]==targetNum){
                return true;

            }
            return false;

        }
        return false;

    }
}
