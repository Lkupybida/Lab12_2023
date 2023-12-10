package org.example.firsttask;

public class ATM {
    private Tray firstTray;
    private int moneyInATM;

    public ATM() {
        firstTray = new Tray500().setNext(new Tray200().setNext(new Tray5()));
        this.moneyInATM = 6969;
    }
    public void process(int money) {
        if (moneyInATM >= money) {
            firstTray.process(money);
            this.moneyInATM -= money;
        } else {
            System.out.println("Not enough money");
        }
    }
}
