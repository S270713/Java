package com.Java.Game2.ShoppingList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplayGame {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    boolean questionReplayGame() throws IOException {
        System.out.println("Еще действие ? (1 - да. 2 - нет)");
        String choose = reader.readLine();
        int chooseInt = Integer.parseInt(choose);
        if (chooseInt == 2) {
            return false;
        }
        return true;
    }
}