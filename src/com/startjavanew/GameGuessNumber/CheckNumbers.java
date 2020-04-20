package com.startjavanew.GameGuessNumber;
// Класс проверки чисел.

public class CheckNumbers {

    boolean compareNumbers(Players actualPlayer) {
        int number = actualPlayer.getAttempt();

        if (number == GameMain.secretNumber) {
            System.out.println("Игрок " + actualPlayer.getName() + " угадал число " + number + " с " + (actualPlayer.getNumberOfAttempt()) + " попытки.");
            return true;
        } else if (GameMain.secretNumber > number) {
            System.out.println(actualPlayer.getName() + ", загаданное число больше вашего варианта.");
        } else {
            System.out.println(actualPlayer.getName() + ", загаданное число меньше вашего варианта.");
        }
        return false;
    }
}