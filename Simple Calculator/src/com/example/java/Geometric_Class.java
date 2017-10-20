package com.example.java;

public class Geometric_Class {

    public void getSin(double x){
        x=Math.toDegrees(x);
        System.out.println("sin("+x+") = "+Math.sin(x));
    }

    public void getCos(double x){
        x=Math.toDegrees(x);
        System.out.println("cos("+x+") = "+Math.cos(x));
    }

    public void getTan(double x){
        x=Math.toDegrees(x);
        System.out.println("tan("+x+") = "+Math.tan(x));
    }
}
