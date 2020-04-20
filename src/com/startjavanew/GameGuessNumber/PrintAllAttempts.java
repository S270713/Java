package com.startjavanew.GameGuessNumber;
// Вывод в конце игры всех названных игроками варииантов.

import com.startjavanew.GameGuessNumber.DataInput.InputAmountPlayers;

import java.util.Arrays;

public class PrintAllAttempts {
    void printAttempts() {
        Messages.messageAllAttempts();
        for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {
            System.out.print(GameMain.player.get(i).getName() + " назвал варианты: ");
            System.out.println(Arrays.toString(GameMain.player.get(i).getAttempts()));
        }
    }
}