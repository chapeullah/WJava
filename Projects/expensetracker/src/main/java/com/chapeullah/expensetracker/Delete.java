package com.chapeullah.expensetracker;

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
    private String description;

    @Override
    public void run() {

    }

}
