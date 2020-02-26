package com.startjavanew.Lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        double a = 17;
        double b = 10;
        double res = 0;
        /*Пользователь выбирает следующую операцию(прим. если выбрано ^ , то возводится число a в степень b):*/
        char operation = '%';
        if (operation == '+') {
            res = a + b;
        }
        if (operation == '-') {
            res = a - b;
        }
        if (operation == '*') {
            res = a * b;
        }
        if (operation == '/') {
            res = a / b;
        }
        if (operation == '^') {
            res = 1;
            for (int i = 1;i <= b;i++) {
                res = res * a;
            }
        }
        if (operation == '%') {
            res = a % b;
        }
        System.out.println(res);
    }
}