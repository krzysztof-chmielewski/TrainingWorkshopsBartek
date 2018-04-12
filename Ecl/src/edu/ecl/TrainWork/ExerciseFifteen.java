package edu.ecl.TrainWork;

public class ExerciseFifteen {
    public static void main(String[] args) {
        String formInput = "1000 ; 2000";
        String[] result = formInput.split(";");

        ExerciseFifteen ConvAndCalc = new ExerciseFifteen();
        Products[] avgPrice = ConvAndCalc.conversion(result);

        System.out.println("Average price of products: " + ConvAndCalc.calcAvg(avgPrice));
    }

    private Products[] conversion(String[] characterToNumber) {
        Products[] result = new Products[characterToNumber.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new Products(Double.valueOf(characterToNumber[i]), 0.3d);
        }
        return result;
    }

    private double calcAvg(Products[] products) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].calcGrossPrice();
        }
        return (double) sum / products.length;
    }
}
