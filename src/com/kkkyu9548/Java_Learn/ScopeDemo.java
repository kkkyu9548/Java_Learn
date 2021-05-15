package com.kkkyu9548.Java_Learn;

public class ScopeDemo {

    static void a() {
        int i = 0;  //지역변수 선언
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a();//i값은 a() 메소드 바깥에서는 값이 변경되지 않기 때문에 무한반복 되지 않는다.***************
            System.out.println(i);
        }
    }

}