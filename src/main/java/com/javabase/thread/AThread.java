package com.javabase.thread;

import java.util.Date;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class AThread implements Runnable {

    private Object lock;

    private BlockingQueue queue;


    public AThread(Object lock, BlockingQueue queue) {
        this.lock = lock;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
                System.out.println("消费："+queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
