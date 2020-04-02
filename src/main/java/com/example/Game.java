package com.example;

import com.example.entity.Player;

public class Game {
    private int countOfMathcesOnTable = 20;
    private int lastCountOfTakenMatches = 1; // 1 because computer must return 3 in first step
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void run() {
        setCurrentPlayer();
        System.out.print("Игра началась! ");
        while (countOfMathcesOnTable > 1) {
            printCountOfMatches();
            System.out.printf("- Ход игрока \"%s\". ", currentPlayer.getName());
            lastCountOfTakenMatches = currentPlayer.getCountOfMatches(countOfMathcesOnTable, lastCountOfTakenMatches);
            if (lastCountOfTakenMatches < 1 || lastCountOfTakenMatches > 3) {
                System.out.println("Некорректное количество спичек!");
            } else if (countOfMathcesOnTable - lastCountOfTakenMatches < 1) {
                System.out.println("На столе не должно остаться меньше 1 спички.");
            } else {
                countOfMathcesOnTable -= lastCountOfTakenMatches;
                setCurrentPlayer();
            }
        }
        System.out.printf("На столе осталась 1 спичка. Игрок \"%s\" проиграл!\n", currentPlayer.getName());
    }

    private void setCurrentPlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }

    private void printCountOfMatches() {
        System.out.println("Количество спичек на столе: " + countOfMathcesOnTable);
    }
}
