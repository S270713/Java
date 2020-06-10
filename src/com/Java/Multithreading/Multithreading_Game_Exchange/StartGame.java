package com.Java.Multithreading.Multithreading_Game_Exchange;

import com.Java.Multithreading.Multithreading_Game_Exchange.Builders.*;
import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;
import com.Java.Multithreading.Multithreading_Game_Exchange.Production.*;

import java.util.Scanner;

//Commit: volatile; setName, прерывание игры игроком, оптимизация кода.

public class StartGame {
    public static void main(String[] args) throws InterruptedException {
        Exchange exchange = new Exchange();

        //Блок: Кирпичи - Здания.
        FactoryBricks1 factoryBricks1 = new FactoryBricks1(exchange);
        FactoryBricks2 factoryBricks2 = new FactoryBricks2(exchange);
        FactoryBricks3 factoryBricks3 = new FactoryBricks3(exchange);
        BuilderBuildings1 builderBuildings1 = new BuilderBuildings1(exchange);
        BuilderBuildings2 builderBuildings2 = new BuilderBuildings2(exchange);
        BuilderBuildings3 builderBuildings3 = new BuilderBuildings3(exchange);

        new Thread(factoryBricks1).start();
        new Thread(factoryBricks2).start();
        new Thread(factoryBricks3).start();

        new Thread(builderBuildings1).start();
        new Thread(builderBuildings2).start();
        new Thread(builderBuildings3).start();

        //Блок: Металл - Мосты.
        FactoryMetal1 factoryMetal1 = new FactoryMetal1(exchange);
        BuilderBridges1 builderBridges1 = new BuilderBridges1(exchange);

        new Thread(factoryMetal1).start();
        new Thread(builderBridges1).start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        factoryBricks1.interrupt();

        factoryBricks2.interrupt();
        factoryBricks3.interrupt();
        builderBuildings1.interrupt();
        builderBuildings2.interrupt();
        builderBuildings3.interrupt();
        factoryMetal1.interrupt();
        builderBridges1.interrupt();
        System.out.println("test");
    }
}