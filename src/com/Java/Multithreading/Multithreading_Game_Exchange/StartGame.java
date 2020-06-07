package com.Java.Multithreading.Multithreading_Game_Exchange;

import com.Java.Multithreading.Multithreading_Game_Exchange.Builders.*;
import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;
import com.Java.Multithreading.Multithreading_Game_Exchange.Production.*;

public class StartGame {
    public static void main(String[] args) {
        Exchange exchange = new Exchange();

        //Блок: Кирпичи - Здания.
        FactoryBricks1 factoryBricks1 = new FactoryBricks1(exchange);
        new Thread(factoryBricks1).start();
        FactoryBricks2 factoryBricks2 = new FactoryBricks2(exchange);
        new Thread(factoryBricks2).start();
        FactoryBricks3 factoryBricks3 = new FactoryBricks3(exchange);
        new Thread(factoryBricks3).start();
        BuilderBuildings1 builders1 = new BuilderBuildings1(exchange);
        new Thread(builders1).start();
        BuilderBuildings2 builders2 = new BuilderBuildings2(exchange);
        new Thread(builders2).start();
        BuilderBuildings3 builders3 = new BuilderBuildings3(exchange);
        new Thread(builders3).start();

        //Блок: Металл - Мосты.
        FactoryMetal1 factoryMetal1 = new FactoryMetal1(exchange);
        new Thread(factoryMetal1).start();
        BuilderBridges1 builderBridges1 = new BuilderBridges1(exchange);
        new Thread(builderBridges1).start();

    }
}