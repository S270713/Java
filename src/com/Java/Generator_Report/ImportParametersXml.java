package com.Java.Generator_Report;
//Класс импорта параметров отчета.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.xml.stream.*;

public class ImportParametersXml {
    public static int pageWidth;
    public static int pageHeight;
    public static int columnNumberWidth;
    public static int columnDateWidth;
    public static int columnNameWidth;

    public void parametersXml(String fileSettingXml) {
        ArrayList <String> list = new ArrayList<>();
        try {
            XMLStreamReader xmlr = XMLInputFactory.newInstance().createXMLStreamReader(fileSettingXml, new FileInputStream(fileSettingXml));
            while (xmlr.hasNext()) {
                xmlr.next();
                if (xmlr.hasText() && xmlr.getText().trim().length() > 0) {
                    list.add(xmlr.getText());
                }
            }
        } catch (FileNotFoundException | XMLStreamException ex) {
            System.out.println("Работа программы приостановлена.");
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).indexOf("Номер") != -1) {
                columnNumberWidth = Integer.parseInt(list.get(i + 1));
            }
            if (list.get(i).indexOf("Дата") != -1) {
                columnDateWidth = Integer.parseInt(list.get(i + 1));
            }
            if (list.get(i).indexOf("ФИО") != -1) {
                columnNameWidth = Integer.parseInt(list.get(i + 1));
            }
        }
        pageWidth = Integer.parseInt(list.get(0));
        pageHeight = Integer.parseInt(list.get(1));
    }
}