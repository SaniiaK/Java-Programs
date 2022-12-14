package com.java.Practice;


    class EncapsulationDemo{
        // Company's employee info
    private int ssn;
    private String empName;
    private int empAge;
     private int emID;

    //Getter and Setter methods
    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
}
public class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         System.out.println(obj.getEmpAge());
        System.out.println(obj.getEmpName());

         obj.setEmpAge(32);
         System.out.println(obj.getEmpAge());
         EncapsulationDemo demo = new EncapsulationDemo();
         demo.setEmpAge(14);

        System.out.println(demo.getEmpAge());
        System.out.println(obj.getEmpAge());

//         obj.setEmpName("Mario");
//         obj.setEmpAge(32);
//         obj.setEmpSSN(112233);
//         System.out.println("Employee Name: " + obj.getEmpName());
//         System.out.println("Employee SSN: " + obj.getEmpSSN());
//         System.out.println("Employee Age: " + obj.getEmpAge());

    }
}
