package com.Java.Lessons.Lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String continueGame = "";
        double buffer1;
        String buffer2;
        Calculator calc = new Calculator();

        while(true) {

            System.out.print("Математическое выражение (пример  5 * 4) используя операции (+ - * / ^ %) : ");
            Scanner inputString = new Scanner(System.in);
            buffer2 = inputString.nextLine();
            calc.setExample(buffer2);
            System.out.println(calc.getExample());

            // Разбор введенного выражения и хранение в массиве
            String components[] = calc.getExample().split(" ");
            System.out.println(components[0]);
            System.out.println(components[1]);
            System.out.println(components[2]);

            int bufferComponent1 = Integer.parseInt((components[0]));
            calc.setFirstNumber(bufferComponent1);

            int bufferComponent2 = Integer.parseInt((components[2]));
            calc.setSecondNumber(bufferComponent2);

            String bufferOper = components[1];
            calc.setOper(bufferOper);

            double resultEnd = calc.calculate();
            System.out.println("Равно: " + resultEnd);

            while(true) {
                System.out.print("Хотите продолжить? [да / нет]: ");
                continueGame = inputString.nextLine();
                System.out.println (continueGame);
                if (continueGame.equals("да") || continueGame.equals("нет")) {
                    break;
                } else {
                    System.out.println("Выберите ответ из предлагаемых вариантов.");
                }
            }
            if (continueGame.equals("нет")) {
                break;
            }
        }
        System.out.println("Игра завершена.");
    }
}