package com.chapeullah.Commands;

import java.util.concurrent.Callable;

import com.chapeullah.Commands.Sub.AddTodoCommand;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    name = "Todo", 
    version = "1.0.0", 
    mixinStandardHelpOptions = true, 
    requiredOptionMarker = '*',
    description = "This is a todo command",
    header = "\nCommandLine",
    optionListHeading = "\nOptions: \n",
    footerHeading = "\nCopyright",
    footer = "\nby chapeullah",
    commandListHeading = "\nSubCommands:\n",
    subcommands = {
        AddTodoCommand.class
    }
)
public class TodoCommand implements Callable<Integer> {

    final Integer SUCCESS = 0;
    final Integer FAILUE = 1;

    public static void main(String[] args) {
        int status = 
            new CommandLine(
                new TodoCommand()
            ).execute(
                "add", 
                "-m=This is a test1",
                "-m=This is a test2",
                "-m=This is a test3"
            );
        System.exit(status);
    }

    @Override
    public Integer call() {
        return null;
    }

}
