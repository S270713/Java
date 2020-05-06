package com.startjavanew.Game2.ShoppingList;

import java.util.HashMap;

public class ShoppingList2Class {
    HashMap<Integer, String> ShoppingList2 = new HashMap<>();

    public void phoneBook2() {
        ShoppingList2.put(100, "свитер");
        ShoppingList2.put(101, "рубашка");
    }

    public void isEmptyList2() {
        if (!ShoppingList2.isEmpty()) {
            System.out.println(ShoppingList2);
        }
    }

    public void clearList2() {
        ShoppingList2.clear();
        System.out.println(ShoppingList2);
    }
}