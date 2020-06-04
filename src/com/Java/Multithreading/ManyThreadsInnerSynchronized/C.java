package com.Java.Multithreading.ManyThreadsInnerSynchronized;

class C implements Runnable {
    Sync sync;
    C(Sync sync) {
        this.sync = sync;
    }
    public void run() {
        sync.test();
    }
}