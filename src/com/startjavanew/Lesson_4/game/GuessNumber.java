package com.startjavanew.Lesson_4.game;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class GuessNumber {

    private Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private Player actualPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {

        actualPlayer = player1;
        System.out.println();
        System.out.println("У вас 10 попыток.");

        int secretNumber = ((int) (101 * Math.random()));
        System.out.println("Загаданное число: " + secretNumber);

        do {
            int number = enterOfNumber();// метод ввода чисел (введенное пользователем число)

            boolean checkOk = checkOfNumber(number, secretNumber);// проверка чисел
            if (checkOk == true) {
                break;
            }

            if (player1.getNumberOfAttempt() == player2.getNumberOfAttempt()) {

                if (actualPlayer.getNumberOfAttempt() == 9) {
                    System.out.println(actualPlayer.getName() + ", у вас закончились попытки.");
                }

                player1.setNumberOfAttempt((player1.getNumberOfAttempt())+1);
            } else {

                if (player2.getNumberOfAttempt() == 9) {
                    System.out.println(actualPlayer.getName() + ", у вас закончились попытки.");
                    //выравниваем индекс кол-ва попыток у игроков для вывода всех вариантов:
                    player1.setNumberOfAttempt((player1.getNumberOfAttempt())-1);
                    break;
                }

                player2.setNumberOfAttempt((player2.getNumberOfAttempt())+1);
            }

            actualPlayer = (actualPlayer == player1) ? player2 : player1;//чередование игроков

        } while(true);
        System.out.println(Arrays.toString(player1.getAttempts()));
        System.out.println(Arrays.toString(player2.getAttempts()));

        cleanOfVariants(); //очистка заполненных вариантов

        player1.setNumberOfAttempt(0);//номер варианта(попытки)
        player2.setNumberOfAttempt(0);

    }
    // метод ввода чисел
    public int enterOfNumber() {
        System.out.println();
        System.out.println("Просим вас ввести число, " + actualPlayer.getName());
        int number = input.nextInt();
        actualPlayer.setAttempt(actualPlayer.getNumberOfAttempt(), number);
        return number;
    }
    // проверка чисел
    public boolean checkOfNumber(int number, int secretNumber) {
        if (number == secretNumber) {
            System.out.println("Игрок " + actualPlayer.getName() + " угадал число " + number + " с " + (actualPlayer.getNumberOfAttempt() + 1) + " попытки.");
            if (player1.getNumberOfAttempt() > player2.getNumberOfAttempt()) {
                player1.setNumberOfAttempt((player1.getNumberOfAttempt()) - 1);
            }
            return true;
        } else if (secretNumber > number) {
            System.out.println(actualPlayer.getName() + ", загаданное число больше вашего варианта.");
        } else {
            System.out.println(actualPlayer.getName() + ", загаданное число меньше вашего варианта.");
        }
        return false;
    }
    //очистка заполненных вариантов
    public void cleanOfVariants() {
        for (int i = 0; i <= player1.getNumberOfAttempt(); i++) {
            player1.setAttempt(i, 0);
            player2.setAttempt(i, 0);
        }
    }
}