package com.Java.Game2.ShoppingList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
//Класс меню команд.
public class ChooseActionList {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Integer, String> ChooseList = new HashMap<>();

    public void ChooseAction() {
        ChooseList.put(1, "Смотреть Основной листок");
        ChooseList.put(2, "Добавить в Основной листок");
        ChooseList.put(3, "Кол-во позиций в Основном листке");
        ChooseList.put(4, "Удалить из Основного листка");
        ChooseList.put(5, "Показать номера позиций Основного лиистка");
        ChooseList.put(6, "Показать позиции Основного листка");
        ChooseList.put(7, "Объединить два листка");
        ChooseList.put(8, "Проверить, что Дополнительный листок не пустой");
        ChooseList.put(9, "Очистить/зачеркнуть все в Дополнительном листке");

        for (Map.Entry entry : ChooseList.entrySet()) {
            Integer key = (Integer) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}