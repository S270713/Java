package com.Java.GameGuessNumber.Procedures;

import com.Java.GameGuessNumber.AbstractOldRecords.PrintOldRecords;
import com.Java.GameGuessNumber.DataClear.ClearAttempts;
import com.Java.GameGuessNumber.InputData.InputAmountPlayers;
import com.Java.GameGuessNumber.ObjectClasses.Players;
import com.Java.GameGuessNumber.ObjectClasses.StorageArray.PrintAllAttempts;

public class AfterGame {
    public void afterGame(Players actualPlayer) {

        PrintAllAttempts printAllAttempts = new PrintAllAttempts();//Вывод всех названных игроками вариантов.
        printAllAttempts.printAttempts(actualPlayer);

        PrintOldRecords printOldRecords = new PrintOldRecords();//Вывод теоретической таблицы старых рекордов.
        printOldRecords.tableOldRecordsForm();
        printOldRecords.listOldRecordsPlayers();

        ClearAttempts clearAttempts = new ClearAttempts();//Очистка заполненных вариантов
        clearAttempts.clear();

        for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {//Обнуление номера варианта(попытки).
            GameMain.player.get(i).countAttemptsPlayers.setcountAttempts(0);
        }
        GameMain.player.removeAll(GameMain.player);//Очистка имен.
    }
}