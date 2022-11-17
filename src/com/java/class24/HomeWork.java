package com.java.class24;

public class HomeWork {
    public static void main(String[] args) {
 //1. Write a program to find all duplicates number from the array (Implement this program to get unique numbers in the output)
        //Try to brainstorm and create a logic, use pen and paper to write down what you do and find the next step, You can also work in a group of 3 to 4 for the brainstorming
        //Example
        //Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
        //Output : Duplicate numbers - 23, 44, 35
// 2. Write a program to print the sum of each COLUMN from a 2D array
        //Example
        //Array:
        //{23, 44, 21},
        //{45, 42, 31},
        //{73, 14, 0}
        //Output : Duplicate numbers - 141, 100 ,52
//3. Program to sort the elements of an array in ascending order (Same from the previous homework)
        //Example
        //Input : 5, 2, 8, 7, 3, 6
        //Output : Duplicate numbers - 2, 3, 5, 6, 7, 8

        System.out.println("=======Task1========");

        int num [] = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};
        int duplicates[]=new int [num.length];

        for (int i =0; i < num.length; i++){
            for (int a =i+1; a <num.length; a++){

                if(isAlreadyPrinted(duplicates,num[i])){
                    System.out.print(num[i] + " ");
                    duplicates[i]= num[i];
                }
            }
        }

        System.out.println("=======Task2=======");
        int arr[][]={{23, 44, 21},
                    {45, 42, 31},
                    {73, 14, 0}};
        int sum =0;
        for (int d = 0; d < arr.length; d++){
            sum=0;
            for (int f = 0; f < arr[d].length; f++){
                sum = sum + arr[f][d];
            }
            System.out.println(sum);
        }

        System.out.println("=======Task3=======");

        int info []= {5, 2, 8, 7, 3, 6};


        for (int z =0; z < info.length; z++){
            for (int x=z+1; x < info.length; x++){
                if (info[z] > num[x]){
                    int swap=info[z];
                    info[z]=info[x];
                    info[x]=swap;

                }
            }
            System.out.print(info[z] + ", ");
        }


    }
    static boolean isAlreadyPrinted(int data [], int dup){
        boolean result =true;
        for (int s =0; s <data.length; s++){
            if (data[s] == dup){
                result=true;
                break;
            }else {
                result=false;
            }

        }
            return result;
    }
}
