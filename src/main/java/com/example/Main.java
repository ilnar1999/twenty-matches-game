package com.example;

import com.example.entity.Computer;
import com.example.entity.Person;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(new Computer(), new Person());
        game.run();
    }
}
