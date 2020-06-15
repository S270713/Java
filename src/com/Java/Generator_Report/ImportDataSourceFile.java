package com.Java.Generator_Report;
//Класс импорта данных.

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImportDataSourceFile {
    public List dataSourceFile(String fileSourceData) {
        List<String> array = new ArrayList<>(); //временный массив для приема основных данных из файла. Одна ячейка - одна строка.
        try {
            FileInputStream fis = new FileInputStream(fileSourceData);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-16");
            BufferedReader reader = new BufferedReader(isr);

            String line = reader.readLine();
            while (line != null) {
                array.add(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Работа программы приостановлена.");
        } catch (IOException e) {
            System.out.println("Работа программы приостановлена.");
        }
        return array;
    }
}