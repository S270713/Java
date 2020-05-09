package com.Java.Lessons.Lesson_2_3.other;

public class Wolf2 {
    private String name;
    private String color;
    private boolean isMale;
    private int weight;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age > 8) {
            System.out.println("Некорректный возраст.");
        }
    }

    public void sit() {
        System.out.println("Я сижу.");
    }

    public void go() {
        System.out.println("Я иду.");
    }

    public void run() {
        System.out.println("Я бегу.");
    }

    public void howl() {
        System.out.println("Я могу выть.");
    }

    public void hunt() {
        System.out.println("Я на охоте.");
    }
}