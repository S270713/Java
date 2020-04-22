package com.startjavanew.GameGuessNumber.ObjectClasses.StorageArray;

// Вывод в конце игры всех названных игроками варииантов.

import com.startjavanew.GameGuessNumber.InputData.InputAmountPlayers;
import com.startjavanew.GameGuessNumber.ObjectClasses.Players;
import com.startjavanew.GameGuessNumber.Procedures.GameMain;
import com.startjavanew.GameGuessNumber.OtherTools.Messages;

import java.util.Arrays;

public class PrintAllAttempts {

    public void printAttempts(Players actualPlayer) {
        Messages.messageAllAttempts();
        for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {
            System.out.print(GameMain.player.get(i).getName() + " назвал варианты: ");
            System.out.println(Arrays.toString(GameMain.player.get(i).storageArray.getAttempts(actualPlayer)));
        }
    }
}