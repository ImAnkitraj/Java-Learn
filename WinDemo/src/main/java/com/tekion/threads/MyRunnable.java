package com.tekion.threads;

import static com.tekion.threads.ThreadColor.*;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from my runnable run()");
    }
}
