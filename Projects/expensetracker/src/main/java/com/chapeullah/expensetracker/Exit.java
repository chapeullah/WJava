package com.chapeullah.expensetracker;

import picocli.CommandLine.Command;

@Command(
    name = "exit",
    description = "Exit the Expense Tracker CLI.",
    mixinStandardHelpOptions = true
)
public class Exit implements Runnable {
    
    @Override
    public void run() {
        System.exit(0);
    }
}
