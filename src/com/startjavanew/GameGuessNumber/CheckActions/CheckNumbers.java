package com.startjavanew.GameGuessNumber.CheckActions;
// Класс проверки чисел.

import com.startjavanew.GameGuessNumber.ObjectClasses.Players;
import com.startjavanew.GameGuessNumber.ObjectClasses.SecretNumber;

public class CheckNumbers {

    public boolean compareNumbers(Players actualPlayer) {
        int number = actualPlayer.storageArray.getAttempt(actualPlayer);
        if (number == SecretNumber.getSecretNumber()) {
            System.out.println("Игрок " + actualPlayer.getName() + " угадал число " + number + " с " + (actualPlayer.numberOfAttempt.getNumberOfAttempt()) + " попытки.");
            return true;
        } else if (SecretNumber.getSecretNumber() > number) {
            System.out.println(actualPlayer.getName() + ", загаданное число больше вашего варианта.");
        } else {
            System.out.println(actualPlayer.getName() + ", загаданное число меньше вашего варианта.");
        }
        return false;
    }
}