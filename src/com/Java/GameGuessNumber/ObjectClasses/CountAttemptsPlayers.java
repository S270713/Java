package com.Java.GameGuessNumber.ObjectClasses;
//Класс описания объекта - счетчк вариантов(попыток) игроков.

public class CountAttemptsPlayers {

    private int countAttempts;//счетчик вариантов (попыток)

    public int getcountAttempts() {
        return countAttempts;
    }

    public void setcountAttempts(int countAttempts) {
        this.countAttempts = countAttempts;
    }
}