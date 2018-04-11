package edu.ecl.TrainWork;

public class ExerciseTwelve {
    public static void main(String[] args) {
        ExerciseTwelve helperObjectToCalc = new ExerciseTwelve();
        ExerciseEleven help1 = new ExerciseEleven();

        String formInput = "5 ; 8 ; 12 ; 17 ; 23 ; 27";
        String[] result = formInput.split(";");
        double[] avPrice = helperObjectToCalc.convertion(result);

        System.out.println("Average price of products: " + help1.calculateAverage(avPrice));
    }


    private double[] convertion(String[] characterToNumber) {
        double[] result = new double[characterToNumber.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Double.valueOf(characterToNumber[i]);
        }
        return result;
    }
