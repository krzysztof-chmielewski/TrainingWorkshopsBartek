package edu.ecl.TrainWork;

public class ExerciseEleven {
    public static void main(String[] args) {
        ExerciseEleven obj = new ExerciseEleven();

        System.out.println("Average calculated from values from first table = " + obj.calculateAverage(arrayNumbers1));
    }

    private static double[] arrayNumbers1 = {4, 5, 8, 9, 11, 345345};

    public double calculateAverage(double[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return (double) sum / numbers.length;
    }
}