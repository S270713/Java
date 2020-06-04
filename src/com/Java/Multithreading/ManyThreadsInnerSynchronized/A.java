package com.Java.Multithreading.ManyThreadsInnerSynchronized;

class A implements Runnable {
    Sync sync;
    A(Sync sync) {
        this.sync = sync;
    }
    public void run() {
        sync.test();
    }
}