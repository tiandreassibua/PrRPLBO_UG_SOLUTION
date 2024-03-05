package com.ug3.soal1;

public class Makanan {
    private String name,expired;
    private double weight, quantity;

    public double getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public String getExpired() {
        return expired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}