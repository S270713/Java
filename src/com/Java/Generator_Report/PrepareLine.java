package com.Java.Generator_Report;
//Класс подготовки и вывода строки в отчет.

import java.io.IOException;
import java.util.List;

public class PrepareLine {
    LineBreak lineBreak = new LineBreak();
    ColumnWidthClass columnWidthClass = new ColumnWidthClass();
    Header header = new Header();
    //Обработка всего массива строк и добавление в отчет.
    boolean prepareLine(List<String> arrayLine, String fileReport) throws IOException {
        String [] arrayElements;//массив для элементов при разбиении строки, используя знак табуляции.
        String [][] arraySubElements = new String[10][10];//двумерный массив для подэлементов.
        int columnWidth = 0;
        //Обработка каждой строки исходных данных
        for (int i = 0; i < arrayLine.size(); i++) {
            arrayElements = arrayLine.get(i).split("\t");//разбиваем строку на элементы.
            for(int j = 0; j < arrayElements.length; j++) {//добавляем эти элементы в массив подстрок.
                arraySubElements[0][j] = arrayElements[j];//элементы заносим в массив подэлементов в первую строку, в остальные будут внесены перенесенные части элемента(подэлементы).
                arrayElements[j] = null;//очистка после передачи элементов.
            }
            int countColumnToFile = arrayElements.length;//кол-во столбцов для вывода по каждой записи

            //процедура разбивки(перенос) длинных элементов.
            int k = 0;
            while (arraySubElements[0][k] != null) {
                columnWidth = columnWidthClass.columnWidth(k);
                if (arraySubElements[0][k].length() > columnWidth) {//условие - выход длины элемента за границу столбца.
                    lineBreak.lineBreak(arraySubElements[0][k], columnWidth);
                    //перезаписываем двумерный массив с элементами, сохраняя в отдельной ячейке каждый подэлемент элемента.
                    //подэлементы одного элемента формируем столбцом.
                    for(int n = 0; n < 10; n++) {
                        arraySubElements[n][k] = lineBreak.subLineBreak[n];
                        lineBreak.subLineBreak[n] = null;//очистка после передачи подэлементов.
                    }
                }
                k++;
            }

            //добавляем подготовленную строку (с переносами) в файл.
            int countLineToFile = lineBreak.indexSubLineBreak;//кол-во строк для вывода по каждой записи(с учетом переносов)
            lineBreak.indexSubLineBreak = 1;//обнуление кол-ва строк для вывода для одной записи
            ExportToFile exportToFile = new ExportToFile();
            exportToFile.exportToFile(arraySubElements, countLineToFile, countColumnToFile, fileReport);
        }
        return true;
    }
}