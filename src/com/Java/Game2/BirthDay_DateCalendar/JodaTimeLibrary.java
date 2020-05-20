package com.Java.Game2.BirthDay_DateCalendar;
//JodaTimeLibrary

import java.time.LocalDate;
import java.time.Month;

public class JodaTimeLibrary {

    void method2() {
        System.out.println("\nБаза рассылки №2.");
        LocalDate today = LocalDate.now();
        System.out.println("Обновление базы данных: " + today);

        LocalDate date = LocalDate.of(2020, Month.MAY, 16);
        int year = date.getYear();
        Month month = date.getMonth();
        System.out.println("Месяц копирования БД : " + month + " " + year);
    }
}