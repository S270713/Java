package com.startjavanew.GameGuessNumber.CheckActions;
//Проверка на предмет кол-ва оставшихся попыток у каждого игрока.

import com.startjavanew.GameGuessNumber.InputData.InputAmountPlayers;
import com.startjavanew.GameGuessNumber.InputData.InputNumberAttempts;
import com.startjavanew.GameGuessNumber.ObjectClasses.CountAttemptsPlayers;
import com.startjavanew.GameGuessNumber.ObjectClasses.Players;

public class CheckNumberAllAttempts {
    InputNumberAttempts inputNumberAttempts = new InputNumberAttempts();
    CountAttemptsPlayers countAttemptsPlayers = new CountAttemptsPlayers();

    public boolean checkAllAttemptsPlayers(Players actualPlayer, int i) {

        if((actualPlayer.countAttemptsPlayers.getcountAttempts() == inputNumberAttempts.getNumberAttempts())) {
            System.out.println(actualPlayer.getName() + ", у вас закончились попытки.");
            if(i == InputAmountPlayers.amountPlayers) {//Проверка, что это последняя попытка последнего игрока.
                return true;
            }
        }
        return false;
    }
}