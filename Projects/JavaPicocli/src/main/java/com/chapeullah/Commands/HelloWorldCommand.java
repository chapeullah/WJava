package com.chapeullah.Commands;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name = "helloWorld",
    description = "It prints Hello, world!",
    mixinStandardHelpOptions = true
)
public class HelloWorldCommand implements Runnable {
    
    public static void main(String[] args) {
        new CommandLine(new HelloWorldCommand()).execute(args);
    }

    @Override
    public void run() {
        System.out.println("Hello, world!");
    }

}
