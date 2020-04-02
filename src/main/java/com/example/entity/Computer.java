package com.example.entity;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Computer implements Player {
    private String name;
    private static int countOfComputers = 0;

    public Computer() {
        countOfComputers++;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите имя компьютера %d: ", countOfComputers);
        this.name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }

    public int getCountOfMatches(int countOfMatchesOnTable, int lastCount) {
        int countOfMatches = 4 - lastCount;

        if (countOfMatchesOnTable < 5) {
            return countOfMatchesOnTable - 1;
        }

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Количество взятых компьтером спичек: %d\n", countOfMatches);
        return countOfMatches;
    }
}
