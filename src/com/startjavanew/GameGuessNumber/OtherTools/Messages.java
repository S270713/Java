package com.startjavanew.GameGuessNumber.OtherTools;
//Сообщения для игроков.

import com.startjavanew.GameGuessNumber.InputData.*;

public class Messages {

    //GameStart сообщения.
    public static void messageGameBegin() {
        System.out.println("Игра 'Угадай число.'");
    }

    public static void messageParameteresDefault() { System.out.println("Базовые параметры: Кол-во игроков - 2, Кол-во попыток у каждого - 10. \nВыберите: \nДа - играть с данными параметрами, Нет - задать араметры самостоятельно."); }
    public static void messageGameOver() {
        System.out.println("Игра завершена.");
    }

    //BeforeGame сообщения.
    public static void messageSecretNumber(int i) { System.out.println("\nЗагаданное число: " + i); }
    public static void message10Attempts() {
        InputNumberAttempts inputNumberAttempts = new InputNumberAttempts();

        System.out.println("Выявление ошибки 2. Начало. inputNumberAttempts.getNumberAttempts() = ");
        System.out.println(inputNumberAttempts.getNumberAttempts());
        System.out.println("Выявление ошибки 2. Конец.");

        System.out.println("\nУ вас " + inputNumberAttempts.getNumberAttempts() + " попыток.");
    }

    //InputNumberAttempts.
    public static void messageNumberAttempts1() { System.out.println("\nВведите количество попыток у каждого игрока: "); }
    public static void messageNumberAttempts2(int i) { System.out.println("Количество попыток у каждого игрока: " + i); }

    //InputAmountPlayers сообщеня.
    public static void messageAmountPlayers1() {
        System.out.println("\nВведите количество игроков: ");
    }
    public static void messageAmountPlayers2(int i) {
        System.out.println("Количество игроков в игре: " + i);
    }

    //PrintAllAttempts сообщения.
    public static void messageAllAttempts() {
        System.out.println("\nВсе названные варианты игроков: ");
    }
}