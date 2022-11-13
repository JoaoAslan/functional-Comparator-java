package aula1.application;

import aula1.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        Collections.sort(list);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
