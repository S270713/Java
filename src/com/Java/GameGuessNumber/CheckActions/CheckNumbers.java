package com.Java.GameGuessNumber.CheckActions;
// Класс сверки названных чисел и загаданного числа.

import com.Java.GameGuessNumber.ObjectClasses.Players;
import com.Java.GameGuessNumber.ObjectClasses.SecretNumber;

public class CheckNumbers {

    public boolean compareNumbers(Players actualPlayer) {
        if (actualPlayer.storageArrayAttempts.getAttempt(actualPlayer) == SecretNumber.getSecretNumber()) {
            System.out.println("Игрок " + actualPlayer.getName() + " угадал число " + actualPlayer.storageArrayAttempts.getAttempt(actualPlayer) + " с " + (actualPlayer.countAttemptsPlayers.getcountAttempts()) + " попытки.");
            return true;
        } else if (SecretNumber.getSecretNumber() > actualPlayer.storageArrayAttempts.getAttempt(actualPlayer)) {
            System.out.println(actualPlayer.getName() + ", загаданное число больше вашего варианта.");
        } else {
            System.out.println(actualPlayer.getName() + ", загаданное число меньше вашего варианта.");
        }
        return false;
    }
}