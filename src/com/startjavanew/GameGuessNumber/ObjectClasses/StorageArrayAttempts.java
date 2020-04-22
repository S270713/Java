package com.startjavanew.GameGuessNumber.ObjectClasses;

//Массив для хранения введенных чисел.

import java.util.Arrays;

public class StorageArrayAttempts {

    private int[] attempts = new int[10];
    NumberOfAttempt numberOfAttempt = new NumberOfAttempt();

    public int[] getAttempts(Players actualPlayer) {
        return Arrays.copyOf(attempts, actualPlayer.numberOfAttempt.getNumberOfAttempt());
    }

    //возвращает последнее введенное игроком число из массива:
    public int getAttempt(Players actualPlayer) {
        return attempts[actualPlayer.numberOfAttempt.getNumberOfAttempt() - 1];
    }

    public void setAttempt(Players actualPlayer, int number) {
        attempts[actualPlayer.numberOfAttempt.getNumberOfAttempt()] = number;
        actualPlayer.numberOfAttempt.setNumberOfAttempt(actualPlayer.numberOfAttempt.getNumberOfAttempt() + 1);
    }

    //очистка заполненных вариантов
    public void clearNumbers(Players players) {
        Arrays.fill(attempts, 0, numberOfAttempt.getNumberOfAttempt(), 0);
    }
}