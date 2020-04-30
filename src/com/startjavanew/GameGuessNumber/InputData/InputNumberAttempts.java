package com.startjavanew.GameGuessNumber.InputData;
//Класс объекта - общее количество попыток игроков.

import com.startjavanew.GameGuessNumber.OtherTools.Messages;

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
        Messages.messageNumberAttempts2(numberAttempts);
    }
}