package com.javabase.thread;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class BThread implements Runnable {

    private Object lock;

    private BlockingQueue queue;

    public BThread(Object lock, BlockingQueue queue) {
        this.lock = lock;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                System.out.println("生产.....");
                queue.put(Math.random());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
