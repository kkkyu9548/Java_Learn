package com.kkkyu9548.Java_Learn;

public class ScopeDemo2 {
    static int i;   //전역변수에서 선언

    static void a() {
        i = 0;
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();    //전역변수 밖에서 메소드가 선언되어서 값이 바뀐다.
            System.out.println(i);
        }
    }

}