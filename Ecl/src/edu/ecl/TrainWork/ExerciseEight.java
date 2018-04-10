package edu.ecl.TrainWork;

public class ExerciseEight {

    public static void main(String[] args) {
        String firstFormText = "12.99";
        String secondFormText = "13.49";

        double firstProductPrice = Double.parseDouble(firstFormText);
        double secondProductPrice = Double.valueOf(secondFormText);

        System.out.println("Wartość pierwszej liczby zmiennoprzecinkowej to: " + firstProductPrice);
        System.out.println("Wartość drugiej liczby zmiennoprzecinkowej to: " + secondProductPrice);
    }
}