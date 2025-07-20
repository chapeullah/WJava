package com.chapeullah;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

import com.chapeullah.Model.Expense;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StorageManager {

    private static int id = 1;
    private static final File expensesFile = new File("expenses.json");
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static ArrayList<Expense> expenses;

    public static void addExpense(String description, double amount) {
        try {
            if (expensesFile.exists()) {
                expenses = objectMapper.readValue(
                    expensesFile, new TypeReference<>() {}
                );
            }
            else {
                expenses = new ArrayList<>();
            }
            expenses.add(new Expense(id, description, amount, LocalDate.now()));
            objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValue(expensesFile, expenses);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static boolean removeExpense(int id) {
        try {
            if (!expensesFile.exists()) {
                return false;
            }
            expenses = objectMapper.readValue(
                expensesFile, new TypeReference<>() {}
            );
            if (!expenses.removeIf(expense -> expense.getId() == id)) {
                return false;
            }
            objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValue(expensesFile, expenses);

        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        return true;
    }

    public static double getSummary(int month) {
        double summary = 0;
        try {
            expenses = objectMapper.readValue(
                expensesFile, new TypeReference<>() {}
            );
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (month != -1) {
            for (Expense expense : expenses) {
                if (LocalDate.parse(expense.getDate()).getMonthValue() == month) {
                    summary += expense.getAmount();
                }
            }
        }
        else {
            for (Expense expense : expenses) {
                summary += expense.getAmount();
            }
        }
        return summary;
    }

    public static ArrayList<Expense> getExpenses() {
        try {
            expenses = objectMapper.readValue(
                expensesFile, new TypeReference<>() {}
            );
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new ArrayList<>();
        }
        return expenses;
    }

}
