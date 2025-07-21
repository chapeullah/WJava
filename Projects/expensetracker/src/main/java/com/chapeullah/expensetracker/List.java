package com.chapeullah.expensetracker;

import java.util.ArrayList;

import com.chapeullah.StorageManager;
import com.chapeullah.Model.Expense;

import picocli.CommandLine.Command;

@Command(
    name = "list",
    description = "List all recorded expenses.",
    mixinStandardHelpOptions = true
)
public class List implements Runnable {

    @Override
    public void run() {
        ArrayList<Expense> expenses = StorageManager.getExpenses();
        System.out.println("# ID    Date         Description          Amount");
        for (Expense expense : expenses) {
            System.out.printf(
                "# %-5d %-12s %-20s ₽%-10.2f\n", 
                expense.getId(), 
                expense.getDate(),
                expense.getDescription(),
                expense.getAmount()
            );
        }
    }

}
