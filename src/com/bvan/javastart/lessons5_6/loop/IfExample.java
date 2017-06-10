package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class IfExample {

    public static void main(String[] args) {
        int x = 10;

        if (x < 20) {
            if (x > 5) {
                System.out.println("1");
            }
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
