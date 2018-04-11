package edu.ecl.TrainWork;

public class Product {
    double price;
    double tax;

    double CalculateGrossPrice() {
        return price + (price * tax);
    }
}