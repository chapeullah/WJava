package com.chapeullah.expensetracker;

import picocli.CommandLine.Command;

@Command(
    name = "list",
    description = "List all recorded expenses.",
    mixinStandardHelpOptions = true
)
public class List implements Runnable {

    @Override
    public void run() {
        
    }

}
