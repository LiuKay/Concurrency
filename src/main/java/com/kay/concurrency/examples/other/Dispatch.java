package com.kay.concurrency.examples.other;

/**
 * Created by kay on 2017/9/4.
 */
public class Dispatch {

    public static class SuperClass{

        public void show(A a){
            System.out.println("父类showA");
        }

        public void show(B b){
            System.out.println("父类showB");
        }
    }

    public static class SubClass extends SuperClass{

        public void show(A a){
            System.out.println("子类showA");
        }

        public void show(B b){
            System.out.println("子类showB");
        }
    }

    public static class A{}

    public static class B{}

    public static void main(String[] args) {
        SuperClass father = new SuperClass();
        SuperClass son = new SubClass();
        father.show(new A());
        son.show(new B());
    }

}
