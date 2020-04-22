package com.startjavanew.GameGuessNumber.Procedures;

import com.startjavanew.GameGuessNumber.InputData.*;
import com.startjavanew.GameGuessNumber.ObjectClasses.*;
import com.startjavanew.GameGuessNumber.OtherTools.Messages;
import com.startjavanew.GameGuessNumber.OtherTools.NamesPrint;

import java.io.IOException;

public class BeforeGame {
    public void beforeGame() throws IOException {
        SecretNumber secretNumber = new SecretNumber();
        InputAmountPlayers.amount();// Блок ввода количества игроков.

        InputName namePlayer = new InputName();//Блок ввода имени игроков.
        for (int i = 1; i <= InputAmountPlayers.amountPlayers; i++) {
            GameMain.player.add(new Players(namePlayer.inputName(i)));
        }

        //Вывод имен всех игроков, участвующих в иигре.
        NamesPrint namesPrint = new NamesPrint();
        namesPrint.addNames();

        //Компьютер загадывает секретное число.
        secretNumber.setSecretNumber(((int) (101 * Math.random())));
        Messages.messageSecretNumber(secretNumber.getSecretNumber());
        Messages.message10Attempts();
    }
}