package com.Java.Lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String replayGame = "";
        Calculator calc = new Calculator();
        do {
            System.out.print("Введите первое число: ");
            Scanner input = new Scanner(System.in);
            calc.setFirstNumber(input.nextDouble());

            System.out.print("Введите второе число: ");
            calc.setSecondNumber(input.nextDouble());

            System.out.print("Введите знак (+ - * / ^ %) : ");
            calc.setSign(input.next().charAt(0));

            System.out.println("Равно: " + calc.calculate());
            do {
                System.out.println("Выберите ответ из предлагаемых вариантов.");
                System.out.print("Хотите продолжить? [да / нет]: ");
                replayGame = input.next();
                System.out.println ("Ваш ответ: " + replayGame);
            } while (!replayGame.equals("да") && !replayGame.equals("нет"));
        } while(replayGame.equals("да"));
        System.out.println("Игра завершена.");
    }
}