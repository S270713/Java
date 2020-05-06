package com.Java.GameGuessNumber.CheckActions;
//Проверка на предмет кол-ва оставшихся попыток у каждого игрока.

import com.Java.GameGuessNumber.InputData.InputAmountPlayers;
import com.Java.GameGuessNumber.InputData.InputNumberAttempts;
import com.Java.GameGuessNumber.ObjectClasses.CountAttemptsPlayers;
import com.Java.GameGuessNumber.ObjectClasses.Players;

public class CheckNumberAllAttempts {
    InputNumberAttempts inputNumberAttempts = new InputNumberAttempts();
    CountAttemptsPlayers countAttemptsPlayers = new CountAttemptsPlayers();

    public boolean checkAllAttemptsPlayers(Players actualPlayer, int i) {

        if((actualPlayer.countAttemptsPlayers.getcountAttempts() == actualPlayer.inputNumberAttempts.getNumberAttempts())) {
            System.out.println(actualPlayer.getName() + ", у вас закончились попытки.");
            if((i + 1) == InputAmountPlayers.amountPlayers) {//Проверка, что это последняя попытка последнего игрока.
                return true;
            }
        }
        return false;
    }
}