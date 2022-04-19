package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float min val = " + myMinFloatValue);
        System.out.println("Float max val = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("double min val = " + myMinDoubleValue);
        System.out.println("double max val = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        //Challenge pound to kg calculator
        double pound = 200d;
        double kg = pound * 0.45359237d;

        System.out.println(pound + " Pound(s) are equal to " + kg + " kilograms.");
        
    }
}