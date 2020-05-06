package com.Java.GameGuessNumber.OtherTools;
//Сообщения для игроков.

public class Messages {
    //GameStart сообщения.
    final public static void messageGameBegin() {
        System.out.println("Игра 'Угадай число.'");
    }

    final public static void messageParameteresDefault() { System.out.println("Базовые параметры: Кол-во игроков - 2, Кол-во попыток у каждого - 10. \nВыберите: \nДа - играть с данными параметрами, Нет - задать араметры самостоятельно."); }
    public static void messageGameOver() {
        System.out.println("Игра завершена.");
    }

    //BeforeGame сообщения.
    public static void messageSecretNumber(int buffer) { System.out.println("\nЗагаданное число: " + buffer); }
    public static void message10Attempts(int buffer) {
        System.out.println("\nУ вас " + buffer + " попыток.");
    }

    //InputNumberAttempts.
    public static void messageNumberAttempts1() { System.out.println("\nВведите количество попыток у каждого игрока: "); }
    public static void messageNumberAttempts2(int buffer) { System.out.println("Количество попыток у каждого игрока: " + buffer); }

    //InputAmountPlayers сообщеня.
    public static void messageAmountPlayers1() {
        System.out.println("\nВведите количество игроков: ");
    }
    public static void messageAmountPlayers2(int buffer) {
        System.out.println("Количество игроков в игре: " + buffer);
    }

    //PrintAllAttempts сообщения.
    public static void messageAllAttempts() {
        System.out.println("\nВсе названные варианты игроков: ");
    }
}