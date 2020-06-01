package com.Java.Threads.Threads_Game;

import com.Java.Threads.Threads_Game.Builders.Builders1;
import com.Java.Threads.Threads_Game.Builders.Builders2;
import com.Java.Threads.Threads_Game.Exchange.Exchange;
import com.Java.Threads.Threads_Game.Production.FactoryBricks1;
import com.Java.Threads.Threads_Game.Production.FactoryBricks2;

public class StartGame {
    public static void main(String[] args) {

        Exchange exchange = new Exchange();

        FactoryBricks1 workFactory1 = new FactoryBricks1(exchange);
        Builders1 workBuilders1 = new Builders1(exchange);
        FactoryBricks2 workFactory2 = new FactoryBricks2(exchange);
        Builders2 workBuilders2 = new Builders2(exchange);

        new Thread(workFactory1).start();
        new Thread(workBuilders1).start();
        new Thread(workFactory2).start();
        new Thread(workBuilders2).start();

    }
}