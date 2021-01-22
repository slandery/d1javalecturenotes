package com.tts;
//blueprint for obj in Java
//public determines data access


public class Main {
    //other classes cannot see the private below and cannot access it
    private static int myInt =4;

    //this is my main entry point
    //my interpreter will look for this method
    public static void main(String[] args) {
        //below is a method, method is function living in obj
        System.out.println("Hello world");
        System.out.println(myInt);

    }
}
