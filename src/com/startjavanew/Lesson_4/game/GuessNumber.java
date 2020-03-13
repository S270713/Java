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
        int secretNumber;
        player1.setNumberOfVariant(0);//номер варианта(попытки)
        player2.setNumberOfVariant(0);
        System.out.println();
        System.out.println("У вас 10 попыток.");

        secretNumber = ((int) (101 * Math.random()));
        System.out.println("Загаданное число: " + secretNumber);

        do {
            for (int numberOfPlayer = 1; numberOfPlayer <= 2; numberOfPlayer++ ) {
                actualPlayer = (numberOfPlayer == 1) ? player1 : player2;

                enterNumber(); ////ввод числа

                if (actualPlayer.getNumber() == secretNumber) {
                    System.out.println("Игрок " + actualPlayer.getName() + " угадал число " + actualPlayer.getNumber() + " с " + (actualPlayer.getNumberOfVariant() + 1) + " попытки.");
                    break;
                } else if (secretNumber > actualPlayer.getNumber()) {
                    System.out.println(actualPlayer.getName() + ", загаданное число больше вашего варианта.");
                } else {
                    System.out.println(actualPlayer.getName() + ", загаданное число меньше вашего варианта.");
                }
                if (actualPlayer.getNumberOfVariant() == 9) {
                    System.out.println(actualPlayer.getName() + ", у вас закончились попытки.");
                }
            }
            if (actualPlayer.getNumber() == secretNumber) {
                break;
            }
            if (actualPlayer.getNumberOfVariant() == 9) {
                break;
            }
            player1.setNumberOfVariant((actualPlayer.getNumberOfVariant())+1);
            player2.setNumberOfVariant((actualPlayer.getNumberOfVariant())+1);
        } while(true);
        System.out.println(Arrays.toString(player1.getAttempt()));
        System.out.println(Arrays.toString(player2.getAttempt()));

        cleanOfVariants(); //очистка заполненных вариантов
    }
    //ввод числа
    public void enterNumber() {
        System.out.println();
        System.out.println("Просим вас ввести число, " + actualPlayer.getName());
        actualPlayer.setNumber(input.nextInt());
        actualPlayer.setAttempt(actualPlayer.getNumberOfVariant(), actualPlayer.getNumber());
    }
    //очистка заполненных вариантов
    public void cleanOfVariants() {
        for (int n = 0; n <= (player1.getNumberOfVariant()); n++ ) {
            player1.setAttempt(n, 0);
            player2.setAttempt(n, 0);
        }
    }
}