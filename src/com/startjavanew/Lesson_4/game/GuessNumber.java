package com.startjavanew.Lesson_4.game;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class GuessNumber {
    private Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private Player actualPlayer;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        actualPlayer = player1;
        System.out.println("\nУ вас 10 попыток.");

        secretNumber = ((int) (101 * Math.random()));
        System.out.println("Загаданное число: " + secretNumber);

        do {
            enterNumber();// метод ввода чисел (введенное пользователем число)

            // проверка чисел
            if (compareNumbers()) {
                break;
            }

            if ((actualPlayer == player1) && (player1.getNumberOfAttempt() == 10)) {
                System.out.println(actualPlayer.getName() + ", у вас закончились попытки.");
            }

            if ((actualPlayer == player2) && (player2.getNumberOfAttempt() == 10)) {
                System.out.println(actualPlayer.getName() + ", у вас закончились попытки.");
                break;
            }

            actualPlayer = (actualPlayer == player1) ? player2 : player1;//чередование игроков
        } while(true);

        System.out.println(Arrays.toString(player1.getAttempts()));
        System.out.println(Arrays.toString(player2.getAttempts()));

        player1.clearNumbers(player1); //очистка заполненных вариантов
        player2.clearNumbers(player2);

        player1.setNumberOfAttempt(0);//номер варианта(попытки)
        player2.setNumberOfAttempt(0);
    }

    // метод ввода чисел
    private void enterNumber() {
        System.out.println("\nПросим вас ввести число, " + actualPlayer.getName());
        actualPlayer.setAttempt(input.nextInt());
    }

    // проверка чисел
    private boolean compareNumbers() {
        int number = actualPlayer.getAttempt();

        if (number == secretNumber) {
            System.out.println("Игрок " + actualPlayer.getName() + " угадал число " + number + " с " + (actualPlayer.getNumberOfAttempt()) + " попытки.");
            return true;
        } else if (secretNumber > number) {
            System.out.println(actualPlayer.getName() + ", загаданное число больше вашего варианта.");
        } else {
            System.out.println(actualPlayer.getName() + ", загаданное число меньше вашего варианта.");
        }
        return false;
    }
}