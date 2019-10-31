package com.learn.ajava.gc.objectgc.oom;

public class UnableToCreateNewNativeTreadOOM {

    public static void main(String[] args) {

        int size = 10_1000;
        Thread[] threads = new Thread[size];

        for(int i =0;i<size;i++){
           threads[i] = new Thread(()->{
               try {
                   Thread.sleep(1000L);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println("running");
           });


        }
        for(int i =0;i<size;i++){
            threads[i].start();
        }

    }




}
