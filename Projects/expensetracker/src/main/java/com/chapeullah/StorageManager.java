package com.chapeullah;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

import com.chapeullah.Model.Expense;
import com.chapeullah.Model.IdHolder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StorageManager {

    private static final File expensesFile = new File("expenses.json");
    private static final File idFile = new File("lastId.json");
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
            int lastId = getLastId();
            expenses.add(new Expense(lastId, description, amount, LocalDate.now()));
            saveLastId(++lastId);
            objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValue(expensesFile, expenses);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static int getLastId() throws Exception {
        if (!idFile.exists()) {
            objectMapper.writeValue(idFile, new IdHolder(1));
            return 1;
        }
        JsonNode jsonNode = objectMapper.readTree(idFile);
        if (jsonNode == null || !jsonNode.has("lastId")) {
            objectMapper.writeValue(idFile, new IdHolder(1));
            return 1;
        }
        return jsonNode.get("lastId").asInt();
    }

    private static void saveLastId(int id) throws Exception {
        objectMapper.writeValue(idFile, new IdHolder(id));
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

    public static void clearExpenses() {
        expenses = new ArrayList<>();
        try {
            objectMapper.writeValue(expensesFile, expenses);
            saveLastId(1);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
