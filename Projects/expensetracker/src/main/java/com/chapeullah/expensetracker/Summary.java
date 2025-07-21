package com.chapeullah.expensetracker;

import com.chapeullah.StorageManager;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "summary",
    description = "Show a summary of expenses.",
    mixinStandardHelpOptions = true
)
public class Summary implements Runnable {

    @Option(names = {"-m", "--month"})
    private Integer month;

    @Override
    public void run() {
        if (month == null) {
            System.out.println(StorageManager.getSummary(-1));
        }
        else if (month < 1 || month > 12) {
            System.out.println("Failed: must be 1 <= month <= 12");
        }
        else {
            System.out.println(StorageManager.getSummary(month));
        }
    }

}
