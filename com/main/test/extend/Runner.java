package com.main.test.extend;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Runner {
        public static void main(String...args) {

                
                Thread r1 = new Runner1();
                Thread r2 = new Runner2();
                r1.setDaemon(true);
                r1.start();
                r2.start();
                try {
                        
                        r1.join();
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                System.out.println("Runner Main Class is Finished..");
        }
}

class Runner1 extends Thread {
        @Override
        public void run() {
                for (int i = 0; i < 10; i++){
                        try {
                                Thread.sleep(1000);
                                TimeUnit.MICROSECONDS.sleep(2);
                        } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                        }
                        System.out.println("Runner1 :" + i);
                }
        }
}

class Runner2 extends Thread {
        @Override
        public void run() {
                for (int i = 0; i < 10; i++)
                        System.out.println("Runner2 :" + i);
        }
}