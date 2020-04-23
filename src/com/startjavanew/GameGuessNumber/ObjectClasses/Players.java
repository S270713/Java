package com.startjavanew.GameGuessNumber.ObjectClasses;
//Класс описания игроков-объектов.

public class Players {

    public CountAttemptsPlayers countAttemptsPlayers = new CountAttemptsPlayers();
    public StorageArrayAttempts storageArrayAttempts = new StorageArrayAttempts();

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