package com.main.executor;

import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory  implements ThreadFactory {

        public static int counter =0;
        @Override
        public Thread newThread(Runnable r){

                return new Thread(r, "PoolWorker"+ ++counter);
        }
        
}
