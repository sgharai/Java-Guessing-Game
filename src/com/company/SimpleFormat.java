package com.company;

import java.util.Scanner;

public class SimpleFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String noun = scanner.nextLine();
        System.out.println("Enter an adjective: ");
        String adjective = scanner.nextLine();
        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.printf("%1$s likes to %2$s %3$s things.", noun, verb, adjective);
    }
}
