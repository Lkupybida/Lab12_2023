package org.example.task1;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        int a = 690;
        int b = 69;
        System.out.println("For " + a);
        atm.process(a);
        System.out.println("\nFor " + b);
        atm.process(b);
    }
}