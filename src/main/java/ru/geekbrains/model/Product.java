package ru.geekbrains.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private int id;
    private String title;
    private int cost;


    @Override
    public String toString() {
        return "Product: {" +
                "id = " + id +
                ", title = " + title +
                ", cost = " + cost +
                '}';
    }
}
