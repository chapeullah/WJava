package com.chapeullah.Commands;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Option;

@Command(
    name = "helloWorld",
    description = "It prints Hello, world!",
    mixinStandardHelpOptions = true,
    version = "1.0.0"
)
public class HelloNameCommand implements Runnable {

    @Parameters(
        index = "0", 
        description = "The name to print",
        arity = "1"
    )
    private String name;

    @Parameters(
        index = "1", 
        description = "Provides their age", 
        arity = "1"
    )
    private Integer age;

    @Option(names = {"-c", "--caps"}, description = "Print name in all CAPS")
    private boolean allCaps = false;
    
    public static void main(String[] args) {
        new CommandLine(new HelloNameCommand()).execute("--version");
    }

    @Override
    public void run() {
        if (name == null || name.isEmpty()) {
            System.out.println("Hello, world!");
        }
        else {
            System.out.print(
                "Hello, " + ((allCaps) ? name.toUpperCase() : name) + "!"
            );
            if (age != null) {
                System.out.println(" You are " + age);
            }
            else {
                System.out.println();
            }
        }
    }

}
