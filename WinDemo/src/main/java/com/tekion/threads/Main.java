package com.tekion.threads;

import static com.tekion.threads.ThreadColor.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName(" === Another Thread ===");
        anotherThread.start();
//        anotherThread.run();
        new Thread() {
            public void run() {
                System.out.println(ANSI_CYAN + "Hello from anonymous class thread");
            }
        }.start();

//        Thread myRunnableThread = new Thread(new MyRunnable());
//        myRunnableThread.start();
        Thread anonymousMyRunnable = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "hello from anonymous myRunnable");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_GREEN + "Another thread terminated or timed out, so  iam runing again.");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_GREEN + "I couldn't wait after all, i was interrupted");
                }
            }
        });

        anonymousMyRunnable.start();

        anotherThread.interrupt();
        System.out.println(ANSI_PURPLE + "Hello again from main thread");


    }
}
