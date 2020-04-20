package com.startjavanew.GameGuessNumber.DataInput;
// Класс ввода имени игроков.

import java.util.Scanner;

public class InputName {
    Scanner input = new Scanner(System.in);

    public String inputName(int numberPlayer) {
        System.out.println("Введите имя " + numberPlayer + " игрока: ");
        return input.nextLine();
    }
}