package com.Java.Generator_Report;
// Класс контроля страниц и вывода разделителя между ними, а также выводе ежестраничного заголовка.

import java.io.*;

public class ControlPage {

    public void endPage(String fileReport) {//работа по окончании страницы.
        try {
            FileOutputStream fos = new FileOutputStream(fileReport, true);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-16"));
            bw.write("~\n");//вывод разделиителя страниц.
            bw.write(Header.firstHeader);//вывод заголовка на новой странице.
            bw.write("\n");
            bw.write(DivideLine.divideLine);
            bw.write("\n");
            ExportToFile.controlPageAmount = 0;
            ExportToFile.controlPageAmount++;
            ExportToFile.controlPageAmount++;
            bw.close();
        }
        catch (IOException e) {
            System.out.println("Работа программы приостановлена.");
        }
    }
}