package edu.ecl.TrainWork;

public class ExerciseFourteen {
    public static void main(String[] args) {
        String formInput = "100 ; 200";
        String[] result = formInput.split(";");

        ExerciseFourteen helperObjectToConvertAndCalc = new ExerciseFourteen();
        Product[] avPrice = helperObjectToConvertAndCalc.convertion(result);

        System.out.println("Average price of products: " + helperObjectToConvertAndCalc.calculateAverage(avPrice));
    }

    private Product[] convertion(String[] characterToNumber) {
        Product[] result = new Product[characterToNumber.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new Product();
            result[i].price = Double.valueOf(characterToNumber[i]);
            result[i].tax = 0.23d;
        }
        return result;
    }

    public double calculateAverage(Product[] products) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].CalculateGrossPrice();
        }
        return (double) sum / products.length;
    }
}
