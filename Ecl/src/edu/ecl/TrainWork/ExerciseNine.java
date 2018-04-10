package edu.ecl.TrainWork;

public class ExerciseNine {
    public static void main(String[] args) {
        String price1 = "12a";
        String price2 = "That string definitely will not be parsed to an integer";

        try {
            double firstProductPrice = Double.parseDouble(price1);
            double secondProductPrice = Double.valueOf(price2);
        } catch (NumberFormatException e) {
            System.out.println("During type convertion process, error occurred:" + "\n" + (e));
        }
        //TODO any calculation?
    }
}
