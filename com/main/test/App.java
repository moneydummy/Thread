package com.main.test;
public class App{
        public static void main(String...args) {
                Thread r1 = new Thread(new Runner1());
                Thread r2 = new Thread(new Runner2());
              //  r1.start();
                //r2.start();
        }
}
class Runner1 implements Runnable{
        public void execute(){
                
        }

        @Override
        public void run() {
                for (int i = 0; i < 10; i++)
                        System.out.println("Runner1 :" + i);
                
        }
}

class Runner2 implements Runnable{
        public void execute() {
                for (int i = 0; i < 10; i++) {
                        System.out.println("Runner2 :" + i);
                }
        }
        @Override
        public void run(){
                for (int i = 0; i < 10; i++)
                        System.out.println("Runner2 :" + i);
        }
}