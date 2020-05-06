package com.Java.GameGuessNumber.DataClear;
//очистка заполненных вариантов

import com.Java.GameGuessNumber.InputData.InputAmountPlayers;
import com.Java.GameGuessNumber.Procedures.GameMain;

public class ClearAttempts {
    public void clear() {
        for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {
            GameMain.player.get(i).storageArrayAttempts.clearNumbers(GameMain.player.get(i));
        }
    }
}