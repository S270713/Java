package com.Java.Generator_Report;
//Класс добавления пробелов вместо null и неиспользованного места внутри ячейки.

public class AddSpace {

    ColumnWidthClass reportSupport = new ColumnWidthClass();
    int limitLine;

    String insertSpace(String text, int iColumn) {
        if(text == null) text = " ";
        //нужны изменяемо-импортируемые параметры! Ширина увеличена на единицу, чтобы справа добавился пробел.
        switch(iColumn) {
            case 0: text = String.format("%-9s", text);
                break;
            case 1: text = String.format("%-8s", text);
                break;
            case 2: text = String.format("%-8s", text);
                break;
        }
        text = " " + text;//слева добавляем пробел.
        return text;
    }
}