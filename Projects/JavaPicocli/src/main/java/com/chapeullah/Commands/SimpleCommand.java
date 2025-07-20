package com.chapeullah.Commands;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "Simple", 
    version = "1.0.0", 
    mixinStandardHelpOptions = true, 
    requiredOptionMarker = '*',
    description = "This is a simple command",
    header = "%nSimple command",
    optionListHeading = "%nOptions: %n"
)
public class SimpleCommand implements Runnable {

    @Option(
        names = {"-n", "--name"}, 
        description = "Provide user name",
        required = false,
        paramLabel = "<username>"
    )
    private String name;

    @Override
    public void run() {
        if (name == null || name.isEmpty()) {
            System.out.println("Hello, world!");
        }
        else {
            System.out.println("Hello, " + name + "!");
        }
    }

}
