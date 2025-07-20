package com.chapeullah;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.Line;

import org.jline.console.SystemRegistry;
import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.reader.impl.DefaultParser;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import picocli.CommandLine;
import picocli.shell.jline3.PicocliCommands;

public class Main {

    private static boolean running = true;
    private static Scanner scanner = new Scanner(System.in);
    private static CommandLine commandLine = new CommandLine(new ExpenseTracker());
    private static String input;

    public static void main(String[] args) throws IOException {

        Terminal terminal = TerminalBuilder.builder().build();

        PicocliCommands picocliCommands = new PicocliCommands(commandLine);

        LineReader lineReader = LineReaderBuilder
            .builder()
            .terminal(terminal)
            .completer(SystemRegistry.completer())
            .parser(new DefaultParser())
            .build();

        while (running) {
            System.out.print("expenseTracker>");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Failed: empty input");
            }
            commandLine.execute(input);
        }

        scanner.close();

    }
}
