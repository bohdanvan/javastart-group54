package com.bvan.javastart.lessons3_4.conditions;

/**
 * @author bvanchuhov
 */
public class WorkingWeekExample {

    public static void main(String[] args) {
        int day = 6; // 1..7

        if (day >= 2 && day <= 4) {
            System.out.println("Work");
        } else {
            System.out.println("Friends");
        }
        System.out.println("Java Courses");
    }
}
