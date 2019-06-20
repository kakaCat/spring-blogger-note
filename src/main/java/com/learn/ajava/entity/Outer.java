package com.learn.ajava.entity;

public class Outer {
    private String name;
    private int age;

    public Outer(){}

    private Outer(Builder b) {
        this.age = b.age;
        this.name = b.name;
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder() {

        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Outer build() {

            return new Outer(this);
        }

        @Override
        public String toString(){
            return "名字 :" + this.name + "  年龄 : " + this.age;
        }


    }


}
