package edu.ecl.TrainWork;

class Products {
    private double netPrice;
    private double tax;

    Products(double netPrice, double tax) {
        this.netPrice = netPrice;
        this.tax = tax;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        if (netPrice > 0) {
            this.netPrice = netPrice;
        }
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double calcGrossPrice() {
        return netPrice + (netPrice * tax);
    }
}