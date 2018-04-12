package edu.ecl.TrainWork;

class Product {
    double price;
    double tax;

    double CalculateGrossPrice() {
        return price + (price * tax);
    }

    Product(double price, double tax) {
        this.price = price + 6;
        this.tax = tax;
    }
}