package edu.ecl.TrainWork;

public class ExerciseTen {
    public static void main(String[] args) {
        int[] prices1 = {4, 9};
        int[] prices2 = new int[2];
        prices2[0] = 5;
        prices2[1] = 6;

        System.out.println("Table initialized with values assigned to it, when table is created: " + prices1[0] + ", " + prices1[1]);
        System.out.println("Table initialized with values provided one by one: " + prices2[0] + ", " + prices2[1]);

        /** to działa, ale to nie jest metoda, stąd komentarz :)
         double calculationAverage1 = (double) (prices1[0] + prices1[1]) / prices1.length;
         double calculationAverage2 = (double) (prices2[0] + prices2[1]) / prices2.length;

         System.out.println(calculationAverage1);
         System.out.println(calculationAverage2);
         */
    }
    //TODO nie wiem czemu nie działa mi metoda
    /**
    double calc1(int prices1[0], int prices1[1]) {
        return (prices1[0] + prices1[1]) / prices1.length;
    }
    */
}
