package test;

import lazy.LazySimpleSingleton;
import lazy.LazySimpleSingletonSyn;

public class ExectorThread implements Runnable {


    @Override
    public void run() {
        LazySimpleSingletonSyn lazySimpleSingleton = LazySimpleSingletonSyn.getInstance();
        System.out.println(Thread.currentThread().getName()+"-------"+lazySimpleSingleton);
    }

}
