package com.Java.Multithreading.ManyThreadsInnerSynchronized;

class D implements Runnable {
    Sync sync;
    D(Sync sync) {
        this.sync = sync;
    }
    public void run() {
        sync.test();
    }
}