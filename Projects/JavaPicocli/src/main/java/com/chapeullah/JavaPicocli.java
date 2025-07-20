package com.chapeullah;

import com.chapeullah.Commands.SimpleCommand;

import picocli.CommandLine;

public class JavaPicocli {

    public static void main(String[] args) {
        new CommandLine(new SimpleCommand()).execute("-n=Mario");
    }

}