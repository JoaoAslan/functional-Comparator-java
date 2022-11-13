package aula1.entities;

import java.util.Locale;

public class Product implements Comparable<Product> {

    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return getName().toUpperCase().compareTo(o.getName().toUpperCase());
    }

    @Override
    public String toString() {
        return getName() + String.format(", $%.2f", getPrice());
    }
}