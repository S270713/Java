package com.Java.Multithreading.Interrupt;

public class House extends Thread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Строим дом:");
        House house = new House();
        house.start();
        Thread.sleep(100);
        house.interrupt();
    }

    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                System.out.println("\nРабота была прервана.");
                break;
            }
            System.out.print("Кирпич ");
        }
    }
}