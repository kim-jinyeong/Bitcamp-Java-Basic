package com.bitcamp.web;

import java.util.Scanner;

public class HelloNameApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("id : ");
        String id = scanner.next();
        System.out.print("pw : ");
        String pw = scanner.next();
        System.out.print("name : ");
        String name = scanner.next();
        System.out.println("welcome id : " + id + " pw : " + pw + " name : " + name);
    }
}
