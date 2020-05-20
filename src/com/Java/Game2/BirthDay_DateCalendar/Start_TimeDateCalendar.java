package com.Java.Game2.BirthDay_DateCalendar;
//Классы: Date, Calendar. Многие методы данного класса помечены, как @Deprecated

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Start_TimeDateCalendar {
    public void start_TimeDateCalendar() throws InterruptedException {

        System.out.println("Дни рождения клиентов магазина (для рассылки поздравлений).");
        Date date1 = new Date();
        System.out.println("День рождения Смирновой К.Т.: " + date1);
        Thread.sleep(1000);
        Date date2 = new Date();
        System.out.println("День рождения Петрова В.С.: " + date2);
        System.out.println((date1.getTime() > date2.getTime()) ? "Раньше открытку направить Петровой В.С." : "Раньше открытку направить Смирновой К.Т." );
        System.out.println("У Смирновой ДР раньше, чем у Петровой ?  " + date1.before(date2));

        System.out.println();
        Calendar date3 = new GregorianCalendar(2020, Calendar.MAY,15);//15 мая 2020 г.
        date3.set(Calendar.HOUR, 17);
        date3.set(Calendar.MINUTE, 10);
        System.out.println("Время и дата прошлых отправлений смс-поздравлений Иванову О.А. и членам его семьи:");

        System.out.println(date3.getTime());
        date3.add(Calendar.YEAR, -1);
        System.out.println(date3.getTime());
        date3.roll(Calendar.MONTH, -2);
        System.out.println(date3.getTime());
        System.out.println("Час рассылки: " + date3.get(Calendar.HOUR) + " часов");

        JodaTimeLibrary jodaTimeLibrary = new JodaTimeLibrary();
        jodaTimeLibrary.method2();
    }
}