package com.javabase.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadMain {

    public static void main(String[] args) {

        BlockingQueue<String> queue=new ArrayBlockingQueue<String>(10);
        Object lock=new Object();
        AThread aThread=new AThread(lock,queue);
        BThread bThread=new BThread(lock,queue);

        new Thread(aThread).start();
        new Thread(bThread).start();



    }
}
