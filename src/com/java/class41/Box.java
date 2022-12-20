package com.java.class41;

public class Box <T>{ // T stands for datatypes, which means we can use any data type

    private T date;

    public T getDate(){
        return date;
    }

    public void setDate(T date){
        this.date=date;
    }
}
