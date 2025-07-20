package com.chapeullah;

import com.chapeullah.expensetracker.*;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "expenseTracker",
    version = "1.0",
    subcommands = {
        Add.class,
        Delete.class,
        List.class,
        Summary.class,
        Exit.class
    }
)
public class ExpenseTracker {

    @Option(
        names = {"-h", "--help"}, 
        usageHelp = true, 
        description = "Show this help message."
    )
    private boolean helpRequest;

    @Option(
        names = {"-v", "--version"}, 
        versionHelp = true, 
        description = "Print version information."
    )
    private boolean versionRequest;

}