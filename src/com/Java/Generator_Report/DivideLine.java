package com.Java.Generator_Report;
//Класс расчета длины разделительной линии между записями.

public class DivideLine {
    public static String divideLine = "-";
    public int lengthDivideLine;

    public void divideLine() {
        lengthDivideLine = 6 + 4 + ImportParametersXml.columnNumberWidth + ImportParametersXml.columnDateWidth + ImportParametersXml.columnNameWidth;
        char simbol = 45;//символ "-"
        for (int i = 1; i < lengthDivideLine; i++) {
            divideLine = divideLine.substring(0, i) + simbol;
        }
    }
}