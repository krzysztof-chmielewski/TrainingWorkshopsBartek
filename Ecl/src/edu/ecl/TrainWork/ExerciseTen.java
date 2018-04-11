package edu.ecl.TrainWork;

public class ExerciseTen {
    static int[] prices1 = {4, 9};
    static int[] prices2 = new int[2];

    static double calc1() {
        return (double) (prices1[0] + prices1[1]) / prices1.length;
    }

    static double calc2() {
        prices2[0] = 5;
        prices2[1] = 6;
        return (double) (prices2[0] + prices2[1]) / prices2.length;
    }

    public static void main(String[] args) {

        System.out.println("Table initialized with values assigned to it, when table is created: " + prices1[0] + ", " + prices1[1]);
        System.out.println("Table initialized with values provided one by one: " + prices2[0] + ", " + prices2[1]);

        System.out.println("\nAverage calculated from values from first table = " + calc1());
        System.out.println("Average calculated from values from first table = " + calc2());
    }
}