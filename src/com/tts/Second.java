package com.tts;

import java.util.Scanner;

public class Second {

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("input your first name");
    String myName = input.nextLine();
    System.out.printf("Here is your name: %s\n", myName);
    input.close();

    float roundMeDown =  (int) 4.43f;
            System.out.println(roundMeDown);
            System.out.println((int)roundMeDown);
    }

}
