package com.chapeullah.expensetracker;

import com.chapeullah.StorageManager;

import picocli.CommandLine.Command;

@Command(
    name = "clear",
    description = "Clear the JSON file of expenses.",
    mixinStandardHelpOptions = true
)
public class Clear implements Runnable {
    
    @Override
    public void run() {
        StorageManager.clearExpenses();
    }
}
