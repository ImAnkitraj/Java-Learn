package com.tekion.threads;
import static com.tekion.threads.ThreadColor.*;
public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE +"Hello from " + currentThread().getName());
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "Another thread woke me up");
            return;
        }

        System.out.println(ANSI_BLUE + "3 seconds have been passed and i'm awake");
    }
}
