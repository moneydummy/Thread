package com.main.test.impl;

public class Runner {
     public static void main(String...args) {
             
        Thread r1 = new Thread( new Runnable(){
                @Override
                public void run(){
                        for (int i = 0; i < 10; i++)
                        System.out.println("Runner1 :" + i);
                }
        });

        Thread r2 = new Thread(new Runnable() {
                @Override
                public void run() {
                        for (int i = 0; i < 10; i++)
                                System.out.println("Runner2 :" + i);
                }
        });
        r1.start();
        r2.start();
     }   
}

