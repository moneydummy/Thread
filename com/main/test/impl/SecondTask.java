package com.main.test.impl;

import java.util.concurrent.TimeUnit;

public class SecondTask implements Runnable {

        public static int count=0;
        public int thradCounter = 0;
        @Override
        public void run() {
                System.out.println("<THREAD START > "+ Thread.currentThread().getName() + "------");
                for(int i=0;i<5 ;i++){
                        try{
                         TimeUnit.MILLISECONDS.sleep((long)Math.random()*100);
                        }
                        catch(final InterruptedException e){
                                e.printStackTrace();
                        }
                       System.out.println("Task  ---- "+i + "["+ Thread.currentThread().getName()+"]"); 
                }
                System.out.println("@@@THREAD COmplete @@ " + Thread.currentThread().getName() + "---@@---");
                
        }
        
        public SecondTask(){
               thradCounter = ++count;
        }
}
