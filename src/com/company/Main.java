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
                System.out.print("%dhello Bastaweetee \n");
            }
        }.show();




    }

    /*
    * local inner class
    * */
    public static void print1(){
        class LocalInner{
            public void show(){
                System.out.print("Hello from local inner ");
            }
        }

        new LocalInner().show();



    }

}
