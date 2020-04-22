package com.startjavanew.GameGuessNumber.DataClear;
//очистка заполненных вариантов

import com.startjavanew.GameGuessNumber.InputData.InputAmountPlayers;
import com.startjavanew.GameGuessNumber.Procedures.GameMain;

public class ClearAttempts {
    public void clear() {
        for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {
            GameMain.player.get(i).storageArray.clearNumbers(GameMain.player.get(i));
        }
    }
}