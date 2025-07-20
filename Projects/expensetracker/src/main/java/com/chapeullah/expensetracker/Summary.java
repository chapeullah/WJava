package com.chapeullah.expensetracker;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "summary",
    description = "Show a summary of expenses.",
    mixinStandardHelpOptions = true
)
public class Summary implements Runnable {

    @Option(names = {"-m", "--month"})
    private int month;

    @Override
    public void run() {
        
    }

}
