package com.Java.Generator_Report;
// Класс для деления строки и переноса.

public class LineBreak {
    String[] subLineBreak = new String[10];//массив для перенесенных подэлементов элемента.
    int indexSubLineBreak = 1;

    public void lineBreak(String line, int limit) {
        indexSubLineBreak = 0;
        char bufferChar;
        int firstSymbol = 0;
        int lastSymbol = 0;
        int unicode;
        do {
            for (int i = firstSymbol; i <= (firstSymbol - 1 + limit); i++) {
                bufferChar = line.charAt(i);
                unicode = (int) bufferChar;
                if (!((unicode >= 1040 && unicode <= 1103) || (unicode >= 48 && unicode <= 57) || unicode == 1025 || unicode == 1105)) {
                    lastSymbol = i;
                }
            }
            if (lastSymbol <= firstSymbol) {
                lastSymbol = firstSymbol + limit - 1;//разделяем посередине слова, т.к. не нашли символа раздела.
            }

            subLineBreak[indexSubLineBreak] = line.substring(firstSymbol, lastSymbol + 1);
            indexSubLineBreak++;
            firstSymbol = lastSymbol + 1;
            if ((int) line.charAt(firstSymbol) == 32) {
                firstSymbol++;
            }
        } while (line.length() - firstSymbol > limit );
        if (firstSymbol <= line.length() - 1) {//добавление в массив последней части элемента ячейки.
            subLineBreak[indexSubLineBreak] = line.substring(firstSymbol);
            indexSubLineBreak++;
        }
    }
}