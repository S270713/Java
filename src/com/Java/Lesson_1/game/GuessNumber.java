package com.Java.Lesson_1.game;

public class GuessNumber {
    public static void main(String[] args) {
        //Компьютер загадывает число:
        int secretNumber = 49;
        int numberOfPlayer = 0;
        int maxLimit = 100;
        int minLimit = 1;
        int indicator = 0;
        
        while (numberOfPlayer != secretNumber) {
            /*пользователю предлагается угадать число от 1 до 100*/
            numberOfPlayer = (minLimit + maxLimit) / 2;
            if ((maxLimit - minLimit) == 1) {
                if (indicator == 1) numberOfPlayer = maxLimit;
                indicator = 1; 
            }
            System.out.println();
            System.out.println(numberOfPlayer);
            if (secretNumber > numberOfPlayer) {
                System.out.println("Загаданное число больше вашего варианта.");
                minLimit = numberOfPlayer;
            }
            if (secretNumber < numberOfPlayer) {
                System.out.println("Загаданное число меньше вашего варианта.");
                maxLimit = numberOfPlayer;
            }
        }
        System.out.println();
        System.out.println("Вы угадали!");
        System.out.println("Загаданное число равно:" + secretNumber);
        System.out.println("Ваш вариант:" + numberOfPlayer);
    }
}