package com.startjavanew.Game2.ShoppingList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoppingList1Class {
    HashMap<Integer, String> ShoppingList1 = new HashMap<>();

    public void phoneBook1() {
        ShoppingList1.put(1, "хлеб");
        ShoppingList1.put(2, "молоко");
        ShoppingList1.put(3, "картошка");
    }

    public void printList1() {
        System.out.println(ShoppingList1);
    }

    public void putList1(int chooseNumberInt, String chooseProduct) {
        ShoppingList1.put(chooseNumberInt, chooseProduct);
    }

    public void sizeList1() {
        System.out.println(ShoppingList1.size());
    }

    public void removeList1(int removeNumberInt) {
        ShoppingList1.remove(removeNumberInt);
    }

    public void printKeyList1() {
        Set<Integer> keys = ShoppingList1.keySet();
        System.out.println("Номера позиций: " + keys);
    }

    public void printValuesList1() {
        ArrayList<String> values = new ArrayList<>(ShoppingList1.values());
        System.out.println("Наименования: " + values);
    }

    public void unionList1List2() {
        ShoppingList1.putAll(ChooseActionImplement.shoppingList2.ShoppingList2);
        for (Map.Entry entry : ShoppingList1.entrySet()) {
            System.out.println(entry);
        }
    }
}