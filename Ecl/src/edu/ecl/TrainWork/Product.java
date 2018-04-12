package edu.ecl.TrainWork;

class Product {
    private double price;
    private double tax;

    double calcGrossPrice() {
        return price + (price * tax);
    }

    public double getPrice() {
        return price + tax;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    Product(double price, double tax) {
        this.price = price + 10;
        this.tax = tax;
    }
}