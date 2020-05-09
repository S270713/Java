package com.Java.Lessons.Lesson_4.game;
//Класс ввода чсел.

import java.util.Scanner;

public class InputNumber {
    private Scanner input = new Scanner(System.in);

    // метод ввода чисел
    void enterNumber(Players actualPlayers) {
        System.out.println("\nПросим вас ввести число, " + actualPlayers.getName());
        actualPlayers.setAttempt(input.nextInt());
    }
}