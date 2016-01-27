package com.company;

public class Main {

    public static void main(String[] args) {
        print();
        print1();

    }

    /*
    * anonymous inner class that class used once that good idea
    * */
    public static void print(){
        new Object(){
            public void show(){
                System.out.println("from anonymous class ... h3");
            }
        }.show();
    }

    /*
    * local inner class
    * */
    public static void print1(){
        class Local_inner{
            public void printt(){
                System.out.println("im from local inner class");
            }
        }

        Local_inner local_inner = new Local_inner();
        local_inner.printt();


    }

}
