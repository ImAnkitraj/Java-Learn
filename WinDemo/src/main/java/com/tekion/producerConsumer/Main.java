package com.tekion.producerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

import static com.tekion.producerConsumer.Main.EOF;

public class Main {

    public static final String EOF = "EOF";

    public static void main(String[] args) {
//        List<String> buffer = new ArrayList<>();
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
//        ReentrantLock bufferLock = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_PURPLE);
        MyConsumer consumer = new MyConsumer(buffer, ThreadColor.ANSI_BLUE);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN);
//        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);
//        MyConsumer consumer = new MyConsumer(buffer, ThreadColor.ANSI_BLUE, bufferLock);
//        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);
//        new Thread(producer).start();
//        new Thread(consumer).start();
//        new Thread(consumer2).start();

        executorService.execute(producer);
        executorService.execute(consumer2);
        executorService.execute(consumer);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_RED + "I'm being printed for the Callable ");
                return "his is the callable result";
            }
        });

        try {
            System.out.println(future.get());
        } catch (ExecutionException e) {
            System.out.println("Something went wrong");
        } catch (InterruptedException e) {
            System.out.println("Thread runnig the task got terminated");
        }
        executorService.shutdown();
    }
}

class MyProducer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    //    private List<String> buffer;
//
    private String color;
    private ReentrantLock bufferLoack;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

//    public void run() {
//        Random random = new Random();
//        String[] nums = {"1", "2", "3", "4", "5"};
//        for (String num : nums) {
//            try {
//                System.out.println(color + "Adding..." + num);
//                synchronized (buffer) {
//                    buffer.add(num);
//                }
//                Thread.sleep(random.nextInt(1000));
//            } catch (InterruptedException e) {
//                System.out.println("Producer was interrupted");
//            }
//        }
//
//        System.out.println(color + "Adding EOF and exiting...");
//        synchronized (buffer) {
//            buffer.add("EOF");
//        }
//    }

    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};
        for (String num : nums) {
            try {
                System.out.println(color + "Adding..." + num);
                buffer.put(num);
//                bufferLoack.lock();
//                try {
//                    buffer.add(num);
//                } finally {
//                    bufferLoack.unlock();
//                }
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }

        System.out.println(color + "Adding EOF and exiting...");
//        bufferLoack.lock();
//        try {
//            buffer.add("EOF");
//        } finally {
//            bufferLoack.unlock();
//        }

        try {
            buffer.put(EOF);
        } catch (InterruptedException e) {

        }
    }
}


class MyConsumer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
//    private List<String> buffer;

    private String color;

//    private ReentrantLock bufferLock;
//
//    public MyConsumer(ArrayBlockingQueue<String> buffer, String color, ReentrantLock bufferLock) {
//        this.buffer = buffer;
//        this.color = color;
//        this.bufferLock = bufferLock;
//    }

    public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }


//    public void run() {
//        while (true) {
//            synchronized (buffer) {
//                if (buffer.isEmpty()) {
//                    continue;
//                } else if (buffer.get(0).equals(EOF)) {
//                    System.out.println(color + "Exiting");
//                    break;
//                } else {
//                    System.out.println(color + "Removed " + buffer.remove(0));
//                }
//            }
//
//        }
//    }

    public void run() {
        int counter = 0;
        while (true) {
//            if (bufferLock.tryLock()) {
//                try {
//                    if (buffer.isEmpty()) {
//                        continue;
//                    }
//                    System.out.println(color + "COunter : " + counter);
//                    counter = 0;
//                    if (buffer.get(0).equals(EOF)) {
//                        System.out.println(color + "Exiting");
//                        break;
//                    } else {
//                        System.out.println(color + "Removed " + buffer.remove(0));
//                    }
//                } finally {
//                    bufferLock.unlock();
//                }
//            } else {
//                counter++;
//            }
            synchronized (buffer) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    if (buffer.peek().equals(EOF)) {
                        System.out.println(color + "Exiting...");
                        break;
                    } else {
                        System.out.println(color + "Removing :" + buffer.take());
                    }
                } catch (InterruptedException e) {

                }
            }


        }
    }

}