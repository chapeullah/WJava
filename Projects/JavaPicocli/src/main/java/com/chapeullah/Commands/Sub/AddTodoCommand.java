package com.chapeullah.Commands.Sub;

import java.util.Arrays;
import java.util.concurrent.Callable;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "add", 
    version = "1.0.0", 
    mixinStandardHelpOptions = true, 
    requiredOptionMarker = '*',
    description = "This is a 'todo' sub command",
    header = "Todo subcommand",
    optionListHeading = "%nOptions: %n"
)
public class AddTodoCommand implements Callable<Integer> {

    @Option(
        names = {"-m", "--message"},
        required = true,
        description = "A todo note or a message",
        paramLabel = "<message>"

    )
    String[] message;

    @Override
    public Integer call() {
        System.out.println("Add command: ");
        Arrays.asList(message).forEach(System.out::println);
        return 0;
    }

}
