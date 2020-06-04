package com.Java.Multithreading.ManyThreadsInnerSynchronized;

class B implements Runnable {
    Sync sync;
    B(Sync sync) {
        this.sync = sync;
    }
    public void run() {
        sync.test();
    }
}