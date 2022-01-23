package com.main.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import com.main.test.impl.SecondTask;

public class FirstExe {
        
        public static void main(String[] args) {
                
                ExecutorService exSrv = Executors.newFixedThreadPool(3);

                System.out.println("Before Submit");
                exSrv.submit(new SecondTask());
                System.out.println("After Submit");
                for(int i =0;i<6;i++){
                        exSrv.execute(new SecondTask());
                }
                exSrv.shutdown();
              //  exSrv.execute(new SecondTask());
        }
}
