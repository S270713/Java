package com.startjavanew.Lesson_4.game;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class GuessNumber {

    private Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private Player actualPlayer;
    private int numberOfPlay = 0;// номер запускаемой игры

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int secretNumber;
        int numberOfVariant = 0;//номер варианта(попытки)
        System.out.println("У вас 10 попыток.");

        numberOfPlay++;
        //очистка заполненных вариантов
        if (numberOfPlay > 1) {
            Arrays.fill(player1.getAttempts(), 0, numberOfVariant + 1, 0);
            Arrays.fill(player2.getAttempts(), 0, numberOfVariant + 1, 0);
        }

        do {
            secretNumber = ((int) (101 * Math.random()));
            System.out.println("Загаданное число: " + secretNumber);

            for (int numberOfPlayer = 1; numberOfPlayer <= 2; numberOfPlayer++ ) {
                switch (numberOfPlayer) {
                    case (1):
                        actualPlayer = player1;
                    break;
                    case (2):
                        actualPlayer = player2;
                    break;
                }
                System.out.println("Просим вас ввести число, " + actualPlayer.getName());

                actualPlayer.setNumber(input.nextInt());
                actualPlayer.setAttempts(numberOfVariant, actualPlayer.getNumber());

                if (actualPlayer.getNumber() == secretNumber) {
                    System.out.println("Игрок " + actualPlayer.getName() + " угадал число " + actualPlayer.getNumber() + " с " + (numberOfVariant + 1) + " попытки.");
                    break;
                } else if (secretNumber > actualPlayer.getNumber()) {
                    System.out.println(actualPlayer.getName() + ", загаданное число больше вашего варианта.");
                } else {
                    System.out.println(actualPlayer.getName() + ", загаданное число меньше вашего варианта.");
                }
                if (numberOfVariant == 9) {
                    System.out.println(actualPlayer.getName() + ", у вас закончились попытки.");
                }
            }
            if (actualPlayer.getNumber() == secretNumber) {
                break;
            }
            if (numberOfVariant == 9) {
                break;
            }
            System.out.println();
            numberOfVariant++;
        } while(true);
        System.out.println(Arrays.toString(Arrays.copyOf(player1.getAttempts(),numberOfVariant+1)));
        System.out.println(Arrays.toString(Arrays.copyOf(player2.getAttempts(),numberOfVariant+1)));
    }
}