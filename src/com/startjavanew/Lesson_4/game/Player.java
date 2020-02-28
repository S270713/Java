package com.startjavanew.Lesson_4.game;

public class Player {
    private int number = 0;//введенное пользователем число
    private String name;

    int[] arrayPlayer = new int[10];//поле для хранения введенных чисел
    public void setArrayPlayer(int[] arrayPlayer) {
        this.arrayPlayer = arrayPlayer;
    }
    public int[] getArrayPlayer() {
        return arrayPlayer;
    }

    public Player(String name) {
        this.name = name;
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