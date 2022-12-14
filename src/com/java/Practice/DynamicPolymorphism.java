package com.java.Practice;

import com.java.class31.Bank1;
import javafx.scene.shape.Circle;

public class DynamicPolymorphism {

    String userInput = "Shape";
//    BaseShape bs;
//    switch (userInput){
//        case "Triangle":
//            bs = new Triangle();
//            break;
//
//        case "Square":
//            bs = new Square();
//
//        case "Circle":
//            bs = new Circle();
//    }
//    bs.draw();
//    bs.erase();
//
    }

class BaseShape{
    void erase (){

    }
    void draw (){

    }

    class Triangle extends BaseShape{
        @Override
        void draw() {
            super.draw();
        }
    }
    class Square extends BaseShape{
        @Override
        void draw() {
            super.draw();
        }
    }
    class Circle extends BaseShape{
        @Override
        void draw() {
            super.draw();
        }
    }
}