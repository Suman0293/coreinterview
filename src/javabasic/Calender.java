package javabasic;

import java.util.Calendar;

public class Calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        for (int i = 1; i <= 12; i++) {
            c.add(Calendar.DATE, 30);
            System.out.println(c.getTime());
        }
    }
}
