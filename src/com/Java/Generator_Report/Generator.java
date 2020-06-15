package com.Java.Generator_Report;
//Класс запуска программы.

import java.io.IOException;
import java.util.List;

public class Generator {
    public static void main(String[] args) throws IOException, InterruptedException {
        String fileSettingXml = args[0];
        String fileSourceData = args[1];
        String fileReport = args[2];

        ImportDataSourceFile importDataSourceFile = new ImportDataSourceFile();
        ImportParametersXml importParametersXml = new ImportParametersXml();
        DivideLine divideLine = new DivideLine();
        Header header = new Header();

        List <String> arrayLine = importDataSourceFile.dataSourceFile(fileSourceData);//Массив для приема основных данных из файла. Одна ячейка - одна строка.
        importParametersXml.parametersXml(fileSettingXml);//Импорт параметров отчета из файла xml
        divideLine.divideLine();//Расчет длины разделительной линии между записями.
        header.headerToFile(fileReport);//Создаем файл и выводим заголовок.

        PrepareLine prepareLine = new PrepareLine();
        Boolean reportReady = prepareLine.prepareLine(arrayLine, fileReport);//обработка строк, переносы, формирование отчета.

        if(reportReady) System.out.println("Отчет сформирован.");
    }
}