package com.Java.Game2.ShoppingList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainShoppingList {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ReplayGame replayGame = new ReplayGame();
    ChooseActionImplement chooseActionImplement = new ChooseActionImplement();

    public void start() throws IOException {

        System.out.println("\nУ вас два листка покупок: основной и дополнителььный. Введите команду работы с ними:");
        chooseActionImplement.listsFull();

        do {
            ChooseActionList chooseActionList = new ChooseActionList();
            chooseActionList.ChooseAction();

            System.out.println("\nВведите номер:");
            String choose = reader.readLine();
            int chooseInt = Integer.parseInt (choose);

            chooseActionImplement.implementChoose(chooseInt);

            if(!replayGame.questionReplayGame()) break;
        } while(true);
    }
}