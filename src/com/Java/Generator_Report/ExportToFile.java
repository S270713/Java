package com.Java.Generator_Report;
//Класс экспорта подготовленной строки (с переносами) в файл.

import java.io.*;

public class ExportToFile {
    ControlPage controlPage = new ControlPage();
    AddSpace addSpace = new AddSpace();

    public static int controlPageAmount = 1;//учет количества строк на странице, по истечении ставим "~"

    void exportToFile(String[][] arraySubLines, int countLineToFile, int countColumnToFile, String fileReport) throws IOException {

        //Цикл по всему двумерному массиву. Внешний цикл - по строкам. Внутренний - по столбцам.
        String text;
        int iString;
        int iColumn;
        for (iString = 0; iString < countLineToFile; iString++) {

            FileOutputStream fos = new FileOutputStream(fileReport, true);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-16"));

            for (iColumn = 0; iColumn < countColumnToFile; iColumn++) {
                text = arraySubLines[iString][iColumn];
                arraySubLines[iString][iColumn] = null;//очистка массива после передачи данных.

                //Добавление пробелов вместо null и неиспользованного места (пункт з)) внутри ячейки.
                text = addSpace.insertSpace(text, iColumn);
                bw.write("|");
                bw.write(text);
            }
            bw.write("|\n");
            bw.close();
            if(ExportToFile.controlPageAmount % ImportParametersXml.pageHeight == 0) controlPage.endPage(fileReport);
            controlPageAmount++;
        }

        FileOutputStream fos = new FileOutputStream(fileReport, true);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-16"));
        bw.write(DivideLine.divideLine);
        bw.write("\n");
        bw.close();
        if(ExportToFile.controlPageAmount % ImportParametersXml.pageHeight == 0) controlPage.endPage(fileReport);
        controlPageAmount++;
    }
}