package com.java.class28;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Vehicle {
    Vehicle (){
        System.out.println("From Vehicle");
    }
}
class Car extends Vehicle{
    Car(){
        System.out.println("From Car");
    }
}
class SportCar extends Vehicle{
    SportCar(){
        System.out.println("From SportCar");
    }
}
