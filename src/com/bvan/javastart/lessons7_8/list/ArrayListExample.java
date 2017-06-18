package com.bvan.javastart.lessons7_8.list;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
