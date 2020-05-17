package com.Java.Exercises;
//В массиве найти максимальный элемент с четным индексом.

public class Task1 {
    public static void main(String[] args) {
        int [] array = new int [] {76,3,99,23,46,33,65,23,32,6,4,6,4};
        int xMax = 0;
        int xI = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            if (array[i] > xMax) {
                xMax = array[i];
                xI = i;
            }
        }
        System.out.println("Максимальный элемент с четным индексом " + xI + " : " + xMax);
    }
}