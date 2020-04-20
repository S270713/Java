package com.startjavanew.GameGuessNumber.DataClear;
//очистка заполненных вариантов

import com.startjavanew.GameGuessNumber.DataInput.InputAmountPlayers;
import com.startjavanew.GameGuessNumber.GameMain;

public class ClearAttempts {
    public void clear() {
        for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {
            GameMain.player.get(i).clearNumbers(GameMain.player.get(i));
        }
    }
}