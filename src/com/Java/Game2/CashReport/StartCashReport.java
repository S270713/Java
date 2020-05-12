package com.Java.Game2.CashReport;
//Сериализация/десериализация, transient.

import java.io.*;

public class StartCashReport {
    public void cashReport() throws IOException, ClassNotFoundException {
        System.out.println("\nИнформация для клиентов: проходит пересменка кассы, подождите 2 минуты.");
        System.out.println("Информация в кассе перед отправкой в ГО:");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\TestCashReport.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        CashReport cashReport = new CashReport();
        System.out.println(cashReport);
        System.out.println();
        objectOutputStream.writeObject(cashReport);
        objectOutputStream.flush();
        objectOutputStream.close();

        //Обратный процесс. Десериализация.
        FileInputStream fileInputStream = new FileInputStream("D:\\TestCashReport.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        CashReport cashReportInGO = (CashReport) objectInputStream.readObject();

        System.out.println("Подтверждение от ГО о полученной информации:");
        System.out.println(cashReportInGO);
    }
}