package com.Java.GameGuessNumber.ObjectClasses;
//Массив для хранения введенных чисел. Также идет изменения счетчика-индекса по этому массиву.

import java.util.Arrays;

public class StorageArrayAttempts {

    private int[] attempts = new int[50];//потом константу замениить на кол-во введенных попыток.
    CountAttemptsPlayers countAttemptsPlayers = new CountAttemptsPlayers();

    public int[] getAttempts(Players actualPlayer) {//выводит массив с названными вариантами игрока.
        return Arrays.copyOf(attempts, actualPlayer.countAttemptsPlayers.getcountAttempts());
    }

    public int getAttempt(Players actualPlayer) {//возвращает последнее введенное игроком число из массива:
        return attempts[actualPlayer.countAttemptsPlayers.getcountAttempts() - 1];
    }

    public void setAttempt(Players actualPlayer, int number) {
        attempts[actualPlayer.countAttemptsPlayers.getcountAttempts()] = number;//Добавляет названное число в массив-накопитель.
        actualPlayer.countAttemptsPlayers.setcountAttempts(actualPlayer.countAttemptsPlayers.getcountAttempts() + 1);//Счетчик попыток.
    }

    public void clearNumbers(Players players) {//очистка заполненных вариантов
        Arrays.fill(attempts, 0, countAttemptsPlayers.getcountAttempts(), 0);
    }
}