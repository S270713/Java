package com.startjavanew.Lesson_2_3.other;

public class WolfTest2 {
    public static void main(String[] args) {
        Wolf2 firstStrong = new Wolf2();

        firstStrong.setName("VeryStrong");
        System.out.println("Кличка  " + firstStrong.getName());

        firstStrong.setColor("VeryBlack");
        System.out.println("Цвет  " + firstStrong.getColor());

        firstStrong.setIsMale(false);
        if (firstStrong.getIsMale()) {
            System.out.println("Пол мужской");
        } else {
            System.out.println("Пол женский");
        }

        firstStrong.setWeight(125);
        System.out.println("Вес  " + firstStrong.getWeight());

        firstStrong.setAge(15);
        System.out.println("Возраст  " + firstStrong.getAge());

        System.out.println();
        firstStrong.sit();
        firstStrong.go();
        firstStrong.run();
        firstStrong.howl();
        firstStrong.hunt();
    }
}