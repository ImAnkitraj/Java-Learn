package com.tekion.liveLock;

public class Main {
    public static void main(String[] args) {
        final Worker worker1 = new Worker("Worker1", true);
        final Worker worker2 = new Worker("Worker2", true);

        SharedResource sharedResource = new SharedResource(worker1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker1.work(sharedResource, worker2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker2.work(sharedResource, worker1);
            }
        }).start();;
    }
}
