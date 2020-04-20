package com.startjavanew.GameGuessNumber.DataInput;
//Класс ввода чсел.

import com.startjavanew.GameGuessNumber.Players;

import java.util.Scanner;

public class InputNumber {
    Scanner input = new Scanner(System.in);

    public void enterNumber(Players actualPlayers) {// метод ввода чисел
        System.out.println("\nПросим вас ввести число, " + actualPlayers.getName());
        actualPlayers.setAttempt(input.nextInt());
    }
}