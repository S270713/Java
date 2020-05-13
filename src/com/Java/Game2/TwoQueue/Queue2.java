package com.Java.Game2.TwoQueue;

class Queue2 implements Runnable {
    String info;
    Cashbox cashbox;
    Queue2(Cashbox cashbox){
        this.cashbox=cashbox;
    }
    String[] customers2 = {"1 покупатель очереди №2","2 покупатель очереди №2","3 покупатель очереди №2","4 покупатель очереди №2","5 покупатель очереди №2","6 покупатель очереди №2"};
    public void run(){
        for (int i = 0; i < 6; i++) {
            info = customers2[i];
            cashbox.workQueue2(info);
        }
    }
}