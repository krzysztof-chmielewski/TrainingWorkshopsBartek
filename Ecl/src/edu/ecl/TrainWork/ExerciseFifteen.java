package edu.ecl.TrainWork;

public class ExerciseFifteen {
    public static void main(String[] args) {
        String formInput = "100 ; 150";
        String[] result = formInput.split(";");

        ExerciseFifteen ConvAndCalc = new ExerciseFifteen();
        Product[] avgPrice = ConvAndCalc.conversion(result);

        System.out.println("Average price of products: " + ConvAndCalc.calcAvg(avgPrice));
    }

    private Product[] conversion(String[] characterToNumber) {
        Product[] result = new Product[characterToNumber.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new Product(Double.valueOf(characterToNumber[i]), 0.23d );
        }
        return result;
    }

    private double calcAvg(Product[] products) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].calcGrossPrice();
        }
        return (double) sum / products.length;
    }
}
