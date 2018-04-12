package edu.ecl.TrainWork;

public class Tools extends Products {

    Tools(double price) {
        super(price, 0.5d);
    }

    @Override
    public double calcGrossPrice() {
        return super.calcGrossPrice() - 1;
    }
}

