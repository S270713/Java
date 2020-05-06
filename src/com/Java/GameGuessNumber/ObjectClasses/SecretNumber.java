package com.Java.GameGuessNumber.ObjectClasses;

public class SecretNumber {

    private static int secretNumber;//Загадываемое число.

    public static int getSecretNumber() {
        return secretNumber;
    }

    public static void setSecretNumber(int secretNumberNew) {
        secretNumber = secretNumberNew;
    }
}