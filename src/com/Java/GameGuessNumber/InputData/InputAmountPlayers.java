package com.Java.GameGuessNumber.InputData;
//Определяем количество участвующих в игре игроков.

import com.Java.GameGuessNumber.OtherTools.Messages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputAmountPlayers {
    public static int amountPlayers;//кол-во игроков.

    public static void amount() throws IOException {
        Messages.messageAmountPlayers1();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String amountPlayersText = reader.readLine();

        amountPlayers = Integer.parseInt(amountPlayersText.trim());
        Messages.messageAmountPlayers2(amountPlayers);
    }
}