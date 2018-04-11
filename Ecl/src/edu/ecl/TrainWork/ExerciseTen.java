package edu.ecl.TrainWork;

public class ExerciseTen {
    public static void main(String[] args) {
        ExerciseTen obj = new ExerciseTen();

        arrayprices2[0] = 5;
        arrayprices2[1] = 6;

        System.out.println("Table initialized with values assigned to it, when table is created: " + arrayPrices1[0] + ", " + arrayPrices1[1]);
        System.out.println("Table initialized with values provided one by one: " + arrayprices2[0] + ", " + arrayprices2[1]);

        System.out.println("\nAverage calculated from values from first table = " + obj.averageExample(arrayPrices1));
        System.out.println("Average calculated from values from first table = " + obj.averageExample(arrayprices2));
    }

    private static double[] arrayPrices1 = {4, 9};
    private static double[] arrayprices2 = new double[2];

    private double averageExample(double[] numbers) {
        return (numbers[0] + numbers[1]) / numbers.length;
    }
}