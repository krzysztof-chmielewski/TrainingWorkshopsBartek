package edu.ecl.TrainWork;

public class ExerciseThirteen {
    public static void main (String[] args) {
        ExerciseThirteen helperObjectToConvertAndCalc = new ExerciseThirteen();

        String formInput = "5 ; 8 ; 12 ; 17 ; 23 ; 27";
        String[] result = formInput.split(";");
        ExerciseThirteenProduct[] avPrice = helperObjectToConvertAndCalc.convertion(result);

        System.out.println("Average price of products: " + helperObjectToConvertAndCalc.calculateAverage(avPrice));
    }

    private ExerciseThirteenProduct[] convertion (String[] characterToNumber) {
        ExerciseThirteenProduct[] result = new ExerciseThirteenProduct[characterToNumber.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new ExerciseThirteenProduct();
            result[i].price = Double.valueOf(characterToNumber[i]);
        }
        return result;
    }

    public double calculateAverage (ExerciseThirteenProduct[] products) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].price;
        }
        return (double) sum / products.length;
    }

}
