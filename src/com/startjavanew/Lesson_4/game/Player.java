package com.startjavanew.Lesson_4.game;

import java.util.Arrays;

public class Player {

    private int[] attempt = new int[10];//поле для хранения введенных чисел
    private String name;
    private int number = 0;//введенное пользователем число
    private int numberOfVariant;//номер варианта(попытки)

    public Player(String name) {
        this.name = name;
    }

    public int[] getAttempt() {
        return Arrays.copyOf(attempt, numberOfVariant + 1);
    }
    public void setAttempt(int index, int number) {
        attempt[index] = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfVariant() {
        return numberOfVariant;
    }
    public void setNumberOfVariant(int numberOfVariant) {
        this.numberOfVariant = numberOfVariant;
    }
}