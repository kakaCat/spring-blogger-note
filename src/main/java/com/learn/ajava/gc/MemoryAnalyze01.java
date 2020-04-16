package com.learn.ajava.gc;

import java.time.Instant;
//https://blog.csdn.net/w372426096/article/details/80333657
//https://www.cnblogs.com/javastack/p/11023044.html
public class MemoryAnalyze01 {

    public static void alloc() {
        User user = new User(1, "baiya");
    }
    public static void main(String[] args) {
        long start = Instant.now().toEpochMilli();
        for (int i = 0; i < 100_000_000; i++) {
            alloc();
        }
        long end = Instant.now().toEpochMilli();
        System.out.println("耗时：" + (end - start));
    }


}
//User 对象属于类 Escape 的成员变量，该对象是可能被所有线程访问的，所以会发生逃逸
//https://www.cnblogs.com/linguoguo/p/10956685.html
class Escape {
    private static User u;
    public static void alloc() {
        u = new User(1, "baiya");
    }
}
class User{

    private int age;

    private String name;


    public User(int age,String name){
        this.age=age;
        this.name=name;
    }

}

