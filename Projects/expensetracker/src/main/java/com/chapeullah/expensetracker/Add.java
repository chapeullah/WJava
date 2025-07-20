package com.chapeullah.expensetracker;

import com.chapeullah.StorageManager;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "add",
    description = "Add a new expense record.",
    mixinStandardHelpOptions = true,
    requiredOptionMarker = '*'
)
public class Add implements Runnable {

    @Option(names = {"-d", "--description"}, required = true)
    private String description;

    @Option(names = {"-a", "--amount"}, required = true)
    private double amount;

    @Override
    public void run() {
        StorageManager.addExpense(description, amount);
    }

}
