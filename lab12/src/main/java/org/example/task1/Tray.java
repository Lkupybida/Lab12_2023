package org.example.task1;

public class Tray {
    private int denomination;
    private Tray next;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public Tray setNext(Tray tray) {
        this.next = tray;
        return this;
    }

    public void process(int amount) {
        if (next != null) {
            next.process(amount % denomination);
        }
        else if (amount % denomination > 0) {
            System.out.println(
                    "We cannot output this sum unfortunately");
            System.exit(0);
        }
        System.out.println("You should take "
                + amount / denomination
                + " of denomination " + denomination);

    }

}