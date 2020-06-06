package com.Java.Multithreading.Multithreading_Game_Exchange;
// Игра - биржа.
// Участники:
// Биржа.
// 3 кирпичных завода.
// 3 застройщика зданий из кирпича.
// 1 завод по выпуску металла.
// 1 строитель мостов.


// Планы оптимизации:
// Кол-во синхронизированных методов д.б. только 2! т.к. синхронизация по объекту. разные товары - разные объекты. лимит один.
// активный вход с консоли ? Добавить еще иные комплектующие для моста и производителя.
// Добавить поставки сырья для производителя кирпича.
// Ввести продаже зданий и начисление денежных средств на банковский счет.
// Оптимизировать наименования полей.
// daemons, join
// Кирпичный завод сам стартует потоки для запуска других заводов, поставляющих материал для производства кирпичей.
// вложенные синхронизированные метода

import com.Java.Multithreading.Multithreading_Game_Exchange.Builders.BuilderBridges1;
import com.Java.Multithreading.Multithreading_Game_Exchange.Builders.BuilderBuildings1;
import com.Java.Multithreading.Multithreading_Game_Exchange.Builders.BuilderBuildings2;
import com.Java.Multithreading.Multithreading_Game_Exchange.Builders.BuilderBuildings3;
import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;
import com.Java.Multithreading.Multithreading_Game_Exchange.Production.FactoryBricks1;
import com.Java.Multithreading.Multithreading_Game_Exchange.Production.FactoryBricks2;
import com.Java.Multithreading.Multithreading_Game_Exchange.Production.FactoryBricks3;
import com.Java.Multithreading.Multithreading_Game_Exchange.Production.FactoryMetal1;

//Commit: Отчетность одной строкой динамически изменяющейся. Приведение 4-х методов в Exchange к двум - производители, потребители.
// Организация хранения количества товара любого вида в одной переменной, через объекты. Оптимизация кода, кас-ся отчетности.

public class StartGame {
    public static void main(String[] args) {
        /////System.out.println("Игра началась (будет запущено 8 потоков).");
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