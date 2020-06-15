package com.Java.Generator_Report;
//Класс для работы с шириной столбцов.

public class ColumnWidthClass {

    int columnWidth;
    public int columnWidth(int i) {
        switch(i) {
            case 0: columnWidth = ImportParametersXml.columnNumberWidth;
                break;
            case 1: columnWidth = ImportParametersXml.columnDateWidth;
                break;
            case 2: columnWidth = ImportParametersXml.columnNameWidth;
                break;
        }
        return columnWidth;
    }
}