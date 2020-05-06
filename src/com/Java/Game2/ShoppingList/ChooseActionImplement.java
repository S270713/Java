package com.Java.Game2.ShoppingList;
// Класс исполнения команд по листкам.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChooseActionImplement {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ShoppingList1Class shoppingList1 = new ShoppingList1Class();
    static ShoppingList2Class shoppingList2 = new ShoppingList2Class();

    public void listsFull() {//Наполнение списков
        shoppingList1.phoneBook1();
        shoppingList2.phoneBook2();
    }

    public void implementChoose(int chooseInt) throws IOException {
        switch (chooseInt) {
            case 1:
                shoppingList1.printList1();
                break;
            case 2:
                System.out.println("Добавляем позицию в первый список.");
                System.out.println("Введите номер:");
                String chooseNumber = reader.readLine();
                int chooseNumberInt = Integer.parseInt (chooseNumber);
                System.out.println("Введите товар:");
                String chooseProduct = reader.readLine();
                shoppingList1.putList1(chooseNumberInt, chooseProduct);
                break;
            case 3:
                shoppingList1.sizeList1();
                break;
            case 4:
                System.out.println("Введите номер удаляемой записи:");
                String removeNumber = reader.readLine();
                int removeNumberInt = Integer.parseInt(removeNumber);
                shoppingList1.removeList1(removeNumberInt);
                break;
            case 5:
                shoppingList1.printKeyList1();
                break;
            case 6:
                shoppingList1.printValuesList1();
                break;
            case 7:
                shoppingList1.unionList1List2();
                break;
            case 8:
                shoppingList2.isEmptyList2();
                break;
            case 9:
                shoppingList2.clearList2();
                break;
        }
    }
}