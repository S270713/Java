package com.Java.GameGuessNumber.InputData;
//Класс ввода чсел.

import com.Java.GameGuessNumber.ObjectClasses.Players;

import java.util.Scanner;

public class InputNumber {
    Scanner input = new Scanner(System.in);

    public void enterNumber(Players actualPlayer) {// метод ввода чисел
        System.out.println("\nПросим вас ввести число, " + actualPlayer.getName());
        actualPlayer.storageArrayAttempts.setAttempt(actualPlayer, input.nextInt());
    }
}