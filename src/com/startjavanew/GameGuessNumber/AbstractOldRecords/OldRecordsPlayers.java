package com.startjavanew.GameGuessNumber.AbstractOldRecords;

public interface OldRecordsPlayers extends OldRecordsForm {

    String textForm1 = "\nИгрок ";
    String oldPlayer1Name = "Николай ";
    String oldPlayer2Name = "Дмитрий ";
    String textForm2 = "угадал число с попытки номер ";
    int oldPlayer1Attempt = 1;
    int oldPlayer2Attempt = 10;

    void listOldRecordsPlayers();
}