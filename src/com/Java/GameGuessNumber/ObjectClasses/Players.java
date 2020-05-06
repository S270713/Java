package com.Java.GameGuessNumber.ObjectClasses;
//Класс описания игроков-объектов.

import com.Java.GameGuessNumber.InputData.InputNumberAttempts;

public class Players {

    public CountAttemptsPlayers countAttemptsPlayers = new CountAttemptsPlayers();
    public StorageArrayAttempts storageArrayAttempts = new StorageArrayAttempts();
    public InputNumberAttempts inputNumberAttempts = new InputNumberAttempts();

    private String name;// имя игроков

    public Players(String name) {
        this.name = name;
    }

    public String getName() {
        return name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}