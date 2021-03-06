package com.Java.GameGuessNumber.Procedures;

import com.Java.GameGuessNumber.InputData.*;
import com.Java.GameGuessNumber.ObjectClasses.*;
import com.Java.GameGuessNumber.OtherTools.Messages;
import com.Java.GameGuessNumber.OtherTools.NamesPrint;

import java.io.IOException;

public class BeforeGame {
    public void beforeGame() throws IOException {

        InputAmountPlayers.amount();// Блок ввода количества игроков в игре.

        InputName inputName = new InputName();//Блок ввода имени игроков.
        for (int i = 1; i <= InputAmountPlayers.amountPlayers; i++) {
            GameMain.player.add(new Players(inputName.inputName(i)));
        }

        InputNumberAttempts inputNumberAttempts = new InputNumberAttempts();;//Блок ввода количества попыток у каждого игрока.
        inputNumberAttempts.amountNumberAttempts();

        NamesPrint namesPrint = new NamesPrint();//Вывод имен всех игроков, участвующих в игре.
        namesPrint.addNames();
        SecretNumber secretNumber = new SecretNumber();//Блок - Компьютер загадывает секретное число.
        secretNumber.setSecretNumber(((int) (101 * Math.random())));
        Messages.messageSecretNumber(secretNumber.getSecretNumber());
        Messages.message10Attempts(inputNumberAttempts.getNumberAttempts());
    }
}