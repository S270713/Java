package com.startjavanew.Lesson_4.game;

public class Player {

    private String name;
    private int[] attempts = new int[10];//поле для хранения введенных чисел
    private int number = 0;//введенное пользователем число

    public Player(String name) {
        this.name = name;
    }

    public void setAttempts(int k, int value) {
        attempts[k] = value;
    }
    public int[] getAttempts() {
        return attempts;
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
}