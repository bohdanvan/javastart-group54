package com.bvan.javastart.lessons3_4.types.char_type;

/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\\';
        char c3 = '\u2764';

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        System.out.println("Hello, \u263A");

        // "D:\\"
        System.out.println("\"D:\\\\\"");
    }
}
