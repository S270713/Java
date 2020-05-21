package com.Java.Game2.Present_Constructor;

public class Constructor {
    String nameObject;
    int numberItems;
    String color;
    int countPresents;

    public Constructor(String nameObject) {
        this.nameObject = nameObject;
    }

    protected Constructor(String nameObject, int numberItems) {
        this.nameObject = nameObject;
        this.numberItems = numberItems;
    }

    Constructor(String nameObject, int numberItems, String color) {
        this.nameObject = nameObject;
        this.numberItems = numberItems;
        this.color = color;
    }

    Constructor(int countPresents) {
        this.countPresents = countPresents;
    }

    Constructor() {
        this(3);
    }
}