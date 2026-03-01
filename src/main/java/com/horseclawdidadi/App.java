package com.horseclawdidadi;

/**
 * HorseClawDiDaDi - Demo Project
 * 马力全开，爪到成功
 * 
 * @author HorseClaw
 * @version 1.0.0
 */
public class App {
    
    public static void main(String[] args) {
        System.out.println("🐎 HorseClawDiDaDi Demo Project");
        System.out.println("马力全开，爪到成功！");
    }
    
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}
