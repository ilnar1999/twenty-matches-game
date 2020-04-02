package com.example.entity;

import java.util.Scanner;

public class Person implements Player {
    private String name;
    private static int countOfPersons = 0;

    public Person() {
        countOfPersons++;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("¬ведите им€ игрока %d: ", countOfPersons);
        this.name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public int getCountOfMatches(int countOfMatchesOnTable, int lastCount) {
        int countOfMatches;
        Scanner scanner = new Scanner(System.in);
        System.out.print("¬ведите количество спичек: ");
        countOfMatches = Integer.parseInt(scanner.next());
        return countOfMatches;
    }
}
