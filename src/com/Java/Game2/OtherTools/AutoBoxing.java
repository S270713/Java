package com.Java.Game2.OtherTools;

// Автобокс и распаковка.

public class AutoBoxing {
    public static void main (String[] args) {

        Integer a = 1;
        int a2 = a;
        System.out.println(a2);

        int b = 2;
        Integer b2 = b;
        System.out.println(b2);

        Character c = 'z';
        char c2 = c;
        Character c3 = c2;
        System.out.println(c2);
        System.out.println(c3);
    }
}