package com.Java.GameGuessNumber.ObjectClasses.StorageArray;

// Вывод в конце игры всех названных игроками варииантов.

import com.Java.GameGuessNumber.InputData.InputAmountPlayers;
import com.Java.GameGuessNumber.ObjectClasses.Players;
import com.Java.GameGuessNumber.Procedures.GameMain;
import com.Java.GameGuessNumber.OtherTools.Messages;

import java.util.Arrays;

public class PrintAllAttempts {

    public void printAttempts(Players actualPlayer) {
        Messages.messageAllAttempts();
        for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {
            System.out.print(GameMain.player.get(i).getName() + " назвал варианты: ");
            System.out.println(Arrays.toString(GameMain.player.get(i).storageArrayAttempts.getAttempts(actualPlayer)));
        }
    }
}