package com.kkkyu9548.Java_Learn;

public class ScopeDemo2 {
    static int i;   //전역변수에서 선언

    static void a() {
        i = 0;
//        int i = 0; //i 전역변수가 선언되어 있는데 다시 선언을 하면 a()에서만 유효한 변수를 선언한다는 뜻이다.
        //변수를 선언하는 것은 단순히 변수를 만든다는 것뿐 아니라 유효 범위를 만든다는 것이다.******************
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();    //전역변수 밖에서 메소드가 선언되어서 값이 바뀐다.
            System.out.println(i);
        }
    }

}