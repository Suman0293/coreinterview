package thread;

import java.sql.SQLOutput;

public class PriorityThread extends Thread{
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i < 2; i++) {
            System.out.println(getName() + " -> PR = " + getPriority());
        }
    }

    public static void main(String[] args) {
        PriorityThread t = new PriorityThread("Suman");
        PriorityThread t1 = new PriorityThread("Palak");
        PriorityThread t2 = new PriorityThread("Smn");

        t.setPriority(1);
        t1.setPriority(10);

        t.start();
        t1.start();
        t2.start();
    }
}
