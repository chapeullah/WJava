package com.chapeullah;

import java.util.Scanner;

import picocli.CommandLine;

public class ExpenseTracker {
    public static void main(String[] args) {

        String in = null;

        while (in == null) {
            System.out.print("$ ");
            Scanner scanner = new Scanner(System.in);
            in = scanner.nextLine();
            switch (in) {
                default -> {
                    System.out.println("Unknown command!\n");
                    in = null;
                }
            }
        }

    }
}
