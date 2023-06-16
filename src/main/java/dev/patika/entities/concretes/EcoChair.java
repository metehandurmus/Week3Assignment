package dev.patika.entities.concretes;

import dev.patika.entities.abstracts.Chair;

public class EcoChair extends Chair {
    public EcoChair(double price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Eco Koltuk - " + super.getPrice() + "$";
    }
}
