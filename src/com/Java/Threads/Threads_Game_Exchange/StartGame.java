package com.Java.Threads.Threads_Game_Exchange;

import com.Java.Threads.Threads_Game_Exchange.Builders.Builders1;
import com.Java.Threads.Threads_Game_Exchange.Builders.Builders2;
import com.Java.Threads.Threads_Game_Exchange.Builders.Builders3;
import com.Java.Threads.Threads_Game_Exchange.Exchange.Exchange;
import com.Java.Threads.Threads_Game_Exchange.Production.FactoryBricks1;
import com.Java.Threads.Threads_Game_Exchange.Production.FactoryBricks2;
import com.Java.Threads.Threads_Game_Exchange.Production.FactoryBricks3;

// Сделать: вынести все данные биржи в отдельный класс (server)
// активный вход с консоли ? Сократить кол-во синхронизированных методов.

public class StartGame {
    public static void main(String[] args) {

        Exchange exchange = new Exchange();

        FactoryBricks1 factoryBricks1 = new FactoryBricks1(exchange);
        FactoryBricks2 factoryBricks2 = new FactoryBricks2(exchange);
        FactoryBricks3 factoryBricks3 = new FactoryBricks3(exchange);

        Builders1 builders1 = new Builders1(exchange);
        Builders2 builders2 = new Builders2(exchange);
        Builders3 builders3 = new Builders3(exchange);

        new Thread(factoryBricks1).start();
        new Thread(factoryBricks2).start();
        new Thread(factoryBricks3).start();

        new Thread(builders1).start();
        new Thread(builders2).start();
        new Thread(builders3).start();

    }
}