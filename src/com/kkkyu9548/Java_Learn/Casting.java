package com.kkkyu9548.Java_Learn;

public class Casting {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1;
        System.out.println(b);  // 1.0

//        int c = 1.1;
        int d = (int) 1.1;
        double e = 1.1;
        System.out.println(d);
        System.out.println(e);

//        1 to String
        String f = Integer.toString(1);
        System.out.println(f.getClass());

    }
}
