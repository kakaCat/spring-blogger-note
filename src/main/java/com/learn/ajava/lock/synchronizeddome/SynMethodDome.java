package com.learn.ajava.lock.synchronizeddome;

public class SynMethodDome {


    public void methode1(String name){
        System.out.println("Method 1 start "+ name);

        try {
            synchronized(this){
                System.out.println("Method 1 execute "+ name);
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end "+ name);
    }

    public  void methode2(String name){
        System.out.println("Method 2 start "+ name);

        try {
            synchronized(this){
                System.out.println("Method 2 execute "+ name);
                Thread.sleep(4000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 end "+ name);
    }
    public  void  methode3(String name){
        System.out.println("Method 3 start "+ name);

        try {
            System.out.println("Method 3 execute "+ name);
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 3 end "+ name);
    }

    public static void methode4(String name){
        System.out.println("Method 4 start "+ name);

        try {
            System.out.println("Method 4 execute "+ name);
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 4 end "+ name);
    }

    public static void main(String[] args) {
        final SynMethodDome dome = new SynMethodDome();
        final SynMethodDome dome2 = new SynMethodDome();
        new Thread(() -> dome.methode1("dome")).start();
        new Thread(() -> dome.methode2("dome")).start();

        new Thread(() -> dome2.methode1("dome2")).start();
        new Thread(() -> dome2.methode2("dome2")).start();

    }

//        new Thread(() -> dome.methode2("dome")).start();
//   new Thread(() -> SynClassDome.methode3("dome")).start();

//        SynClassDome dome2 = new SynClassDome();
//        new Thread(() -> dome2.methode1("dome2")).start();
//        new Thread(() -> dome2.methode2("dome2")).start();
//        new Thread(() -> dome2.methode3("dome2")).start();
//        new Thread(() -> dome2.methode4("dome2")).start();
}
