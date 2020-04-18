package com.startjavanew.Lesson_4.game;
//очистка заполненных вариантов

public class ClearAttempts {
    void clear(Players player1, Players player2) {
        player1.clearNumbers(player1);
        player2.clearNumbers(player2);
    }
}