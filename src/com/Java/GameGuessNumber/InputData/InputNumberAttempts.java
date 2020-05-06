package com.Java.GameGuessNumber.InputData;
//Класс объекта - общее количество попыток игроков.

import com.Java.GameGuessNumber.OtherTools.Messages;
import com.Java.GameGuessNumber.Procedures.GameMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputNumberAttempts {

    private int numberAttempts;//кол-во попыток у каждого игрока.

    public int getNumberAttempts() {
        return numberAttempts;
    }

    public void amountNumberAttempts() {
        Messages.messageNumberAttempts1();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String amountNumberAttemptsText = null;
        try {
            amountNumberAttemptsText = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

        numberAttempts = Integer.parseInt(amountNumberAttemptsText.trim());
        //цикл . каждому игроку поставить попытки.
        for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {
            GameMain.player.get(i).inputNumberAttempts.numberAttempts = numberAttempts;
        }
        Messages.messageNumberAttempts2(numberAttempts);
    }
}