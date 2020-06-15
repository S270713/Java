package com.Java.Generator_Report;
// Класс создания заголовока отчета.

import java.io.*;

public class Header {
    String [] subHeader;
    String [][] arraySubLines = new String [1][10];
    static String firstHeader;//заголовок полностью для последующего ежестраничного вывода в отчет.
    AddSpace addSpace = new AddSpace();
    ExportToFile exportToFile = new ExportToFile();
    String text;

    void headerToFile(String fileReport) throws IOException, InterruptedException {

        String header = "Номер  Дата   ФИО";//константу необходимо заменить импортом из файла.
        subHeader = header.split(" +");//разбиваем строку на элементы по пробелу/пробелам.

        for(int j = 0; j < subHeader.length; j++) {//добавляем эти элементы заголовка в массив.
            arraySubLines [0][j] = subHeader [j];
        }
        //Отправка заголовка в файл.
        exportToFile.exportToFile(arraySubLines, 1, subHeader.length, fileReport);
        //Сохраняем (берем из нового отчета) заголовок в поле для последующего ежестраничного вывода в отчет.
        FileInputStream fis = new FileInputStream(fileReport);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-16");
        BufferedReader reader = new BufferedReader(isr);
        firstHeader = reader.readLine();
    }
}