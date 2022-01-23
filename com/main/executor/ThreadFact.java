package com.main.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

import com.main.test.impl.SecondTask;

public class ThreadFact  {
        
        public static void main(String[] args) throws InterruptedException, ExecutionException {
                
                ExecutorService exSrv = Executors.newFixedThreadPool(3, new NamedThreadFactory());
               
                System.out.println("Before Submit");
                System.out.println("After Submit");
                for(int i =0;i<3;i++){
                        Future<?> t =  exSrv.submit(new SecondTask());
                        System.out.println(t.get());
                }
                exSrv.shutdown();
                
              //  exSrv.execute(new SecondTask());
        }

        

}
