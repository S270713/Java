package com.Java.Lessons.Lesson_4.game;
//Основной класс

import java.lang.Math;

public class GameMain {
    Players actualPlayer;
    int secretNumber;

    public void start() {
        //Переход в класс ввода имени игроков
        InputName namePlayer = new InputName();
        Players player1 = new Players(namePlayer.inputName(1));
        Players player2 = new Players(namePlayer.inputName(2));

        actualPlayer = player1;
        System.out.println("\nУ вас 10 попыток.");

        secretNumber = ((int) (101 * Math.random()));
        System.out.println("Загаданное число: " + secretNumber);

        do {
            //Вызов класса ввода числа пользователем.
            InputNumber enter = new InputNumber();
            enter.enterNumber(actualPlayer);

            // Вызов класса проверки чисел.
            CheckNumbers check = new CheckNumbers();
            if (check.compareNumbers(actualPlayer, secretNumber)) {
                break;
            }

            //Проверка на предмет кол-ва оставшихся попыток.
            NumberAttemptsPlayers attemptsPlayers = new NumberAttemptsPlayers();
            if (!attemptsPlayers.checkAttemptsPlayers(player1, player2, actualPlayer)) {
                break;
            }

            actualPlayer = (actualPlayer == player1) ? player2 : player1;//чередование игроков
        } while (true);

        //Вывод всех названных игроками вариантов.
        PrintAllAttempts printAllAttempts = new PrintAllAttempts();
        printAllAttempts.printAttempts(player1, player2);

        //Очистка заполненных вариантов
        ClearAttempts clearAttempts = new ClearAttempts();
        clearAttempts.clear(player1, player2);

        player1.setNumberOfAttempt(0);//номер варианта(попытки)
        player2.setNumberOfAttempt(0);
    }
}