package com.startjavanew.Lesson_4.game;

import java.util.Arrays;

public class Player {

    private int[] attempts = new int[10];//поле для хранения введенных чисел
    private String name;
    private int numberOfAttempt;//номер варианта(попытки)

    public Player(String name) {
        this.name = name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, numberOfAttempt);
    }

    //возвращает последнее введенное игроком число:
    public int getAttempt() {
        return attempts[numberOfAttempt - 1];
    }

    public void setAttempt(int number) {
        attempts[numberOfAttempt] = number;
        setNumberOfAttempt((getNumberOfAttempt())+1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfAttempt() {
        return numberOfAttempt;
    }

    public void setNumberOfAttempt(int numberOfAttempt) {
        this.numberOfAttempt = numberOfAttempt;
    }

    //очистка заполненных вариантов
    public void clearNumbers(Player player) {
        Arrays.fill(player.attempts, 0, numberOfAttempt,0);
    }
}