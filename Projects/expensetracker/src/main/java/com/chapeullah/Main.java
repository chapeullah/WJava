package com.chapeullah;

import java.util.Scanner;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(
    subcommands = {ExpenseTracker.class}
)
public class Main {

    private static boolean running = true;
    private static Scanner scanner = new Scanner(System.in);
    private static CommandLine commandLine = new CommandLine(new Main());

    public static void main(String[] args) {

        while (running) {
            commandLine.execute("expenseTracker", "exit");
            break;
        }

        scanner.close();

    }
}
