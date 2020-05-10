package com.Java.Game2.WalkShop;
//Склад.

public class DoorToWarehouse {
    private String doorStatus = "Дверь в помещения складов заблокирована.";

    Enter enter = new Enter();//Объекты внутреннего класса м.б. созданы только внутри внешнего.
    void infoSchemeWarehouse() {
        enter.schemeWarehouse();//Внешний класс имеет доступ ко всем членам внутреннего класса, в т.ч. private.
    }

    public class Enter {//вход на склад. (ВНУТРЕННИЙ КЛАСС)

        void namePlate() {
            System.out.println("\nВход только для сотрудников магазина.");
        }

        void dootStatus() {//Внутренний класс имеет доступ ко всем полям внешнего, в т.ч. private.
            System.out.println("\n" + doorStatus);
        }

        private void schemeWarehouse() {
            System.out.println("\nСхема склада только для сотрудников.");
        }

        void forklift() {
            class LocalClass {//Локальный класс.
                void danger(){
                    System.out.println("\nОстрожно! Работает погрузчик.");
                }
            }
            LocalClass localClass = new LocalClass();
            localClass.danger();
        }

        void announcementWorkDay() {
            System.out.println("\nРабочий день заканчивается в 21-00.");
        }

        private String password;
        void enterWarehouse(String password) {
            this.password = password;
        }
    }
}

class WorkDay {
    DoorToWarehouse warehouseWorkDay = new DoorToWarehouse() {//Анонимный класс.
        void announcementWorkDay() {
            warehouseWorkDay.enter.announcementWorkDay();
        }
    };
}