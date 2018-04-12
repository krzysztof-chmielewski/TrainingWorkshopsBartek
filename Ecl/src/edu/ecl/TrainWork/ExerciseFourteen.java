package edu.ecl.TrainWork;

/*
public class ExerciseFourteen {
    public static void main(String[] args) {
        String formInput = "100 ; 200";
        String[] result = formInput.split(";");

        ExerciseFourteen helperObjectToConvertAndCalc = new ExerciseFourteen();
        Products[] avPrice = helperObjectToConvertAndCalc.convertion(result);

        System.out.println("Average price of products: " + helperObjectToConvertAndCalc.calculateAverage(avPrice));
    }

    private Products[] convertion(String[] characterToNumber) {
        Products[] result = new Products[characterToNumber.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new Products();
            result[i].price = Double.valueOf(characterToNumber[i]);
            result[i].tax = 0.23d;
        }
        return result;
    }

    public double calculateAverage(Products[] products) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].calcGrossPrice();
        }
        return (double) sum / products.length;
    }
}
*/

