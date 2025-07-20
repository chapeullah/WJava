package com.chapeullah.expensetracker;

import com.chapeullah.StorageManager;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "delete",
    description = "Delete an existing expense by its ID.",
    mixinStandardHelpOptions = true,
    requiredOptionMarker = '*'
)
public class Delete implements Runnable {

    @Option(names = {"-i", "--id"}, required = true)
    private int id;

    @Override
    public void run() {
        StorageManager.removeExpense(id);
    }

}
