package com.Java.Lessons.Lesson_4.game;
//Проверка на предмет кол-ва оставшихся попыток.

public class NumberAttemptsPlayers {

    boolean checkAttemptsPlayers(Players player1, Players player2, Players actualPlayer) {

        if ((actualPlayer == player1) && (player1.getNumberOfAttempt() == 10)) {
            System.out.println(actualPlayer.getName() + ", у вас закончились попытки.");
        }

        if ((actualPlayer == player2) && (player2.getNumberOfAttempt() == 10)) {
            System.out.println(actualPlayer.getName() + ", у вас закончились попытки.");
            return false;
        }
        return true;
    }
}