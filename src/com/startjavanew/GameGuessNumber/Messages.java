package com.startjavanew.GameGuessNumber;
//Сообщения для игроков.

public class Messages {
    //GameStart сообщения.
    static void messageGameBegin() {
        System.out.println("Игра 'Угадай число.' \nПравила игры: ");
    }
    static void messageParameteresDefault() {
        System.out.println("Базовые параметры: Кол-во игроков - 2, Кол-во попыток у каждого - 10. \nВыберите: \nДа - играть с данными параметрами, Нет - задать араметры самостоятельно.");
    }
    static void messageGameOver() {
        System.out.println("Игра завершена.");
    }

    //Game Main сообщения.
    static void messageSecretNumber(int secretNumber) {
        System.out.println("Загаданное число: " + secretNumber);
    }
    static void message10Attempts() {
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
    static void messageAllAttempts() {
        System.out.println("\nВсе названные варианты игроков: ");
    }
}