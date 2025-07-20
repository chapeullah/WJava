package com.chapeullah;

import com.chapeullah.expensetracker.*;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "expensetracker",
    version = "1.0",
    subcommands = {
        Add.class,
        Delete.class,
        Clear.class,
        List.class,
        Summary.class,
        Exit.class
    }
)
public class ExpenseTracker {

    @Option(
        names = {"-h", "--help"}, 
        description = "Show this help message.",
        usageHelp = true
    )
    private boolean helpRequest;

    @Option(
        names = {"-v", "--version"}, 
        versionHelp = true, 
        description = "Print version information."
    )
    private boolean versionRequest;

    public static void main(String[] args) {
        int exit = new CommandLine(new ExpenseTracker()).execute("add", "-d=Computer", "-a=150000");
        System.exit(exit);
    }

}