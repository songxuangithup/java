package com.richinfo.thr;

public class ThreadTest {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "abc";
        final ThreadTest test = new ThreadTest();
        new Thread(()-> test.lockTest(),"t1").start();
        new Thread(()->new ThreadTest().lockTest(),"t2").start();
        new Thread(){
            @Override
            public void run() {

            }

        }.start();
        new Thread(){
            @Override
            public void run() {
                super.run();
                new ThreadTest().lockTest();
            }
        }.start();
    }
    public void lockTest (){
        System.out.println("1111");
        synchronized (this){
            System.out.println("aaaa");
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
