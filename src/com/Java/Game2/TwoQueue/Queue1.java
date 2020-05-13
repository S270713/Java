package com.Java.Game2.TwoQueue;

class Queue1 implements Runnable {
    String info;
    Cashbox cashbox;
    Queue1(Cashbox cashbox){
        this.cashbox=cashbox;
    }
    String[] customers1 = {"1 покупатель очереди №1","2 покупатель очереди №1","3 покупатель очереди №1","4 покупатель очереди №1","5 покупатель очереди №1","6 покупатель очереди №1","7 покупатель очереди №1","8 покупатель очереди №1","9 покупатель очереди №1","10 покупатель очереди №1","11 покупатель очереди №1","12 покупатель очереди №1"};
    public void run(){
        for (int i = 0; i < 12; i++) {
            info = customers1[i];
            cashbox.workQueue1(info);
        }
    }
}