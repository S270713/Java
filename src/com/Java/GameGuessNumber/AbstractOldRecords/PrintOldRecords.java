package com.Java.GameGuessNumber.AbstractOldRecords;
//Теоретические старые рекорды в игре.
//Применено в коде: интерфейсы, абстрактные классы.

public class PrintOldRecords implements OldRecordsForm, OldRecordsPlayers {

    public void tableOldRecordsForm() {
        printTableRecordsForm();
    }

    @Override
    public void listOldRecordsPlayers() {
        StringBuffer oldRecord1 = new StringBuffer();
        oldRecord1.append(textForm1);
        oldRecord1.append(oldPlayer1Name);
        oldRecord1.append(textForm2);
        oldRecord1.append(oldPlayer1Attempt);

        StringBuilder oldRecord2 = new StringBuilder();
        oldRecord1.append(textForm1);
        oldRecord1.append(oldPlayer2Name);
        oldRecord1.append(textForm2);
        oldRecord1.append(oldPlayer2Attempt);

        System.out.println(oldRecord1);
        System.out.println(oldRecord2);
    }
}