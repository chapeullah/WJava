package com.chapeullah.Model;

import java.time.LocalDate;

public class Expense {

    private int id;
    private String description;
    private double amount;
    private String date;

    public Expense() {}

    public Expense(int id, String description, double amount, LocalDate date) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.date = date.toString();
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

}
