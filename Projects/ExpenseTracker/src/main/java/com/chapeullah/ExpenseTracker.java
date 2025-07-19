package com.chapeullah;

import picocli.CommandLine;
import picocli.CommandLine.*;

@Command(name = "expense-tracker")
public class ExpenseTracker implements Runnable {

    @Parameters(index = "0")
    private String command;

    @Option(names = "--description")
    private String description;

    @Option(names = "--amount")
    private Double amount;

    @Option(names = "--id")
    private Integer id;

    @Option(names = "--mounth")
    private Integer month;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ExpenseTracker()).execute(args);
        System.exit(exitCode);
    }

    public void run() {
        switch (command) {
            case "add" -> addCommand();
            case "list" -> listCommand();
            case "delete" -> deleteCommand();
            case "summary" -> summaryCommand();
        }
    }

    private void addCommand() {

    }

    private void listCommand() {

    }

    private void deleteCommand() {

    }

    private void summaryCommand() {
        
    }

}
