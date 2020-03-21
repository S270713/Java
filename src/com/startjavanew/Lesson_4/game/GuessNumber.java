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
        int number = 0;//введенное пользователем число
        int secretNumber;
        player1.setNumberOfAttempt(0);//номер варианта(попытки)
        player2.setNumberOfAttempt(0);
        System.out.println();
        System.out.println("У вас 10 попыток.");

        secretNumber = ((int) (101 * Math.random()));
        System.out.println("Загаданное число: " + secretNumber);

        do {
            actualPlayer = (player1.getNumberOfAttempt() == player2.getNumberOfAttempt()) ? player1 : player2;

            System.out.println();
            System.out.println("Просим вас ввести число, " + actualPlayer.getName());
            number = input.nextInt();
            actualPlayer.setAttempts(actualPlayer.getNumberOfAttempt(), number);

            if (number == secretNumber) {
                System.out.println("Игрок " + actualPlayer.getName() + " угадал число " + number + " с " + (actualPlayer.getNumberOfAttempt() + 1) + " попытки.");
                if (player1.getNumberOfAttempt() > player2.getNumberOfAttempt()) {
                    player1.setNumberOfAttempt((player1.getNumberOfAttempt())-1);
                }
                break;
            } else if (secretNumber > number) {
                System.out.println(actualPlayer.getName() + ", загаданное число больше вашего варианта.");
            } else {
                System.out.println(actualPlayer.getName() + ", загаданное число меньше вашего варианта.");
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
        } while(true);
        System.out.println(Arrays.toString(player1.getAttempts()));
        System.out.println(Arrays.toString(player2.getAttempts()));

        cleanOfVariants(); //очистка заполненных вариантов
    }
    //очистка заполненных вариантов
    public void cleanOfVariants() {
        Arrays.fill(player1.getAttemptsZero(), 0, player1.getNumberOfAttempt(),0);
        Arrays.fill(player2.getAttemptsZero(), 0, player2.getNumberOfAttempt(),0);
    }
}