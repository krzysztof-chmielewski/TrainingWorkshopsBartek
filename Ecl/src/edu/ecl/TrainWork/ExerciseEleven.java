package edu.ecl.TrainWork;

public class ExerciseEleven {
    private static double[] arrayNumbers1 = {4, 5, 8, 9, 11, 345345};

    private double averageExample(double[] numbers) {
        int aggregate = 0;
        for (int i = 0; i < arrayNumbers1.length; i++) {
            aggregate += numbers[i];
        }
        return (double) aggregate / numbers.length;
    }

    public static void main(String[] args) {
        ExerciseEleven obj = new ExerciseEleven();

        System.out.println("Average calculated from values from first table = " + obj.averageExample(arrayNumbers1));
    }
}