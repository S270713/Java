package com.startjavanew.Lesson_4.game;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class GuessNumber {

    private Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private int numberOfPlay = 0;// номер запускаемой игры

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    public void start(Player player1, Player player2) {
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

            System.out.println("Просим первого игрока ввести число: ");
            player1.setNumber(input.nextInt());
            player1.setAttempts(numberOfVariant,player1.getNumber());

            if (player1.getNumber() == secretNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber() + " с " + (numberOfVariant + 1) + " попытки.");
                break;
            } else if (secretNumber > player1.getNumber()) {
                System.out.print(player1.getName());
                answerMore();
            } else {
                System.out.print(player1.getName());
                answerLess();
            }

            if (numberOfVariant == 9) {
                System.out.print(player1.getName());
                endOfVariants();
            }

            System.out.println("Просим второго игрока ввести число: ");
            player2.setNumber(input.nextInt());
            player2.setAttempts(numberOfVariant,player2.getNumber());

            if (player2.getNumber() == secretNumber) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumber() + " с " + (numberOfVariant + 1) + " попытки.");
                break;
            } else if (secretNumber > player2.getNumber()) {
                System.out.print(player2.getName());
                answerMore();
            } else {
                System.out.print(player2.getName());
                answerLess();
            }

            if (numberOfVariant == 9) {
                System.out.print(player2.getName());
                endOfVariants();
                break;
            }
            System.out.println();
            numberOfVariant++;
        } while(true);
        int[] array1full = Arrays.copyOf(player1.getAttempts(),numberOfVariant+1);
        int[] array2full = Arrays.copyOf(player2.getAttempts(),numberOfVariant+1);
        System.out.println(Arrays.toString(array1full));
        System.out.println(Arrays.toString(array2full));
    }

    public void endOfVariants() {
        System.out.println(", у вас закончились попытки.");
    }
    public void answerMore() {
        System.out.println(", загаданное число больше вашего варианта.");
    }
    public void answerLess() {
        System.out.println(", загаданное число меньше вашего варианта.");
    }
}