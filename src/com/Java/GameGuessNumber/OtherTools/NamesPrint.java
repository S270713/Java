package com.Java.GameGuessNumber.OtherTools;
//Вывод списка имен. StringBuilder, StringBuffer.

import com.Java.GameGuessNumber.InputData.InputAmountPlayers;
import com.Java.GameGuessNumber.Procedures.GameMain;

public class NamesPrint {
    StringBuilder listNames = new StringBuilder();

    public void addNames() {
        for (int i = 1; i <= InputAmountPlayers.amountPlayers; i++) {
            listNames.append(GameMain.player.get(i - 1).getName());
            listNames.append(" ");
        }
        System.out.println("\nВ игре будут участвовать: ");
        System.out.println(listNames);
    }
}