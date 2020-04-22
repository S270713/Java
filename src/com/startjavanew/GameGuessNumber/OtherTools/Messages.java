package com.startjavanew.GameGuessNumber.OtherTools;
//Сообщения для игроков.

public class Messages {
    //GameStart сообщения.
    public static void messageGameBegin() {
        System.out.println("Игра 'Угадай число.'");
    }

    public static void messageParameteresDefault() {
        System.out.println("Базовые параметры: Кол-во игроков - 2, Кол-во попыток у каждого - 10. \nВыберите: \nДа - играть с данными параметрами, Нет - задать араметры самостоятельно.");
    }

    public static void messageGameOver() {
        System.out.println("Игра завершена.");
    }

    //Game Main сообщения.
    public static void messageSecretNumber(int secretNumber) {
        System.out.println("\nЗагаданное число: " + secretNumber);
    }

    public static void message10Attempts() {
        System.out.println("\nУ вас 10 попыток.");
    }

    //InputAmountPlayers сообщеня.
    public static void messageAmountPlayers1() {
        System.out.println("\nВведите количество игроков: ");
    }

    public static void messageAmountPlayers2(int amount) {
        System.out.println("Количество игроков в игре: " + amount);
    }

    //PrintAllAttempts сообщения.
    public static void messageAllAttempts() {
        System.out.println("\nВсе названные варианты игроков: ");
    }
}