package com.Java.Game2.WalkShop;

public class ShoppingRoomFood {

    void location() {
        System.out.println("Местонахождение данного товара - Зал ShoppingRoomFood");
    }

    SalesShelf1 salesShelf1 = new SalesShelf1();

    class SalesShelf1 {//ссылка на объект внешнего класса через this.
        String productA1;
        void infoProductA1() {
            System.out.println("Данный товар вы можете найти:");
            ShoppingRoomFood.this.location();//ссылка на объект внешнего класса через this.
        }
    }

    class SalesShelf2 {
        String productB1;
    }

    public void elevator() {
        class ShoppingRoomClothes {//внутренний класс м.б. создан внутри метода.
            void infoFloor2() {
                System.out.println("\nПоднимитесь на лифте. Зал одежды находится на втором этаже.");
                System.out.println();
            }
        }
        ShoppingRoomClothes shoppingRoomClothes = new ShoppingRoomClothes();
        shoppingRoomClothes.infoFloor2();
    }

    public void announcement() {
        for(int i = 1; i <= 3; i++) {//внутренний класс м.б. создан внутри цикла.
            class InfoAnnouncement {
                public void infoAnnouncementForClients() {
                    System.out.println("Объявление: Сегодня действуют скидки 50%");
                }
            }
            InfoAnnouncement infoAnnouncement = new InfoAnnouncement();
            infoAnnouncement.infoAnnouncementForClients();
        }
    }
}