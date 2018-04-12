package edu.ecl.TrainWork;

public class ExerciseSeventeen {
    public static void main(String[] args) {
        String formInput = "1000 ; 2000 ; 3000";
        String[] result = formInput.split(";");

        ExerciseSeventeen ConvAndCalc = new ExerciseSeventeen();
        Tools[] avgPrice = conversion(result);

        System.out.println("Average price of products: " + ConvAndCalc.calcAvg(avgPrice));
    }

    static private Tools[] conversion(String[] characterToNumber) {
        Tools[] result = new Tools[characterToNumber.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new Tools(Double.valueOf(characterToNumber[i]));
        }
        return result;
    }

    private double calcAvg(Tools[] tools) {
        int sum = 0;
        for (int i = 0; i < tools.length; i++) {
            sum += tools[i].calcGrossPrice();
        }
        return (double) sum / tools.length;
    }
}
