package com.example.lab1;

public class BMIModel {


    public static double toDouble(String s){
        double string0 = Double.parseDouble(s);
        return string0;
    }

    public static String formatBMI(double bmi){
        String finalString = String.format("%.2f", bmi);
        return finalString;
    }

    public static double getBMI (double w, double h) {
        return w/ (h*h);
    }
}
