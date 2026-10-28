package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------------------");
        System.out.println("Hello from inside your Dockerized Java App!");
        System.out.println("----------------------------------------------");
        
        // Keeps the container alive so you can see it running
        try {
            while (true) {
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Application interrupted.");
        }
    }
}

