package aula1.application;

import aula1.entities.Product;

import java.util.Comparator;

// https://docs.oracle.com/javase/10/docs/api/java/util/Comparator.html
public class MyComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
