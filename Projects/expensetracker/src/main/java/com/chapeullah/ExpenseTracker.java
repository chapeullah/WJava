package com.chapeullah;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    private static Scanner scanner = new Scanner(System.in);
    private static boolean running = true;

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

        while (running) {
            System.out.print("expensetracker>");
            String input = scanner.nextLine();
            if (input.trim().isEmpty()) {
                input = "";
                System.out.println("Input is empty.\n");
                continue;
            }
            new CommandLine(new ExpenseTracker()).execute(split(input));
        }

    }

    private static String[] split(String input) {
        ArrayList<String> tokens = new ArrayList<>();
        Matcher matcher = Pattern.compile("\"([^\"]*)\"|(\\S+)").matcher(input);
        while (matcher.find()) {
            if (matcher.group(1) != null)
                tokens.add(matcher.group(1));
            else
                tokens.add(matcher.group(2));
        }
        return tokens.toArray(new String[0]);
    }


}