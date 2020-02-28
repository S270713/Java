package com.startjavanew.Lesson_4.game;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class GuessNumber {

    private Scanner input = new Scanner(System.in);
    private Player player1;
    private Player player2;
    int[] array1;
    int[] array2;
    int numberOfPlay = 0;// номер запускаемой игры

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
            Arrays.fill(array1, 0, numberOfVariant + 1, 0);
            Arrays.fill(array2, 0, numberOfVariant + 1, 0);
        }
        array1 = player1.getArrayPlayer();
        array2 = player2.getArrayPlayer();

        do {
            secretNumber = ((int) (101 * Math.random()));
            System.out.println("Загаданное число: " + secretNumber);

            System.out.println("Просим первого игрока ввести число: ");
            player1.setNumber(input.nextInt());
            player1.arrayPlayer[numberOfVariant] = player1.getNumber();

            if (player1.getNumber() == secretNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber() + " с " + (numberOfVariant + 1) + " попытки.");
                break;
            } else if (secretNumber > player1.getNumber()) {
                System.out.println("Загаданное число, " + player1.getName() + ", больше вашего варианта.");
            } else {
                System.out.println("Загаданное число, " + player1.getName() + ", меньше вашего варианта.");
            }

            if (numberOfVariant == 9) {
                System.out.println("У " + player1.getName() + " закончились попытки.");
            }

            System.out.println("Просим второго игрока ввести число: ");
            player2.setNumber(input.nextInt());
            player2.arrayPlayer[numberOfVariant] = player2.getNumber();

            if (player2.getNumber() == secretNumber) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumber() + " с " + (numberOfVariant + 1) + " попытки.");
                break;
            } else if (secretNumber > player2.getNumber()) {
                System.out.println("Загаданное число, " + player2.getName() + ", больше вашего варианта.");
            } else {
                System.out.println("Загаданное число, " + player2.getName() + ", меньше вашего варианта.");
            }

            if (numberOfVariant == 9) {
                System.out.println("У " + player2.getName() + " закончились попытки.");
                break;
            }
            System.out.println();
            numberOfVariant++;
        } while(true);
        array1 = player1.getArrayPlayer();
        array2 = player2.getArrayPlayer();
        int[] array1full = Arrays.copyOf(array1,numberOfVariant+1);
        int[] array2full = Arrays.copyOf(array2,numberOfVariant+1);
        System.out.println(Arrays.toString(array1full));
        System.out.println(Arrays.toString(array2full));
    }
}