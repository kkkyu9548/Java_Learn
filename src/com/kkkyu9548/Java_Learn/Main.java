package com.kkkyu9548.Java_Learn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        sout+enter
        System.out.println(6);//Number
        System.out.println(6+6);
        System.out.println("6"+"6");
        System.out.println(6*6);
//        System.out.println("6"*"6");
        System.out.println("1111".length());    //(문자열 길이)->4
//        System.out.println(1111.length());

        System.out.println(6 + 2);  //  8
        System.out.println(6 - 2);  //  4
        System.out.println(6 * 2);  //  12
        System.out.println(6 / 2);  //  3

//      Math 함수 & (.)관련 명령어
        System.out.println(Math.PI);    //  3.141592653589793
        System.out.println(Math.floor(Math.PI));    //  3.0
        System.out.println(Math.ceil(Math.PI));     //  4.0

        // Character & String
//        System.out.println('HelloWorld');   //Character(문자)
        System.out.println("HelloWorld");   //String(문자열)
        System.out.println("Hello "
            + "World");

        // new line
        System.out.println("Hello \nWorld");
        // escape
        System.out.println("Hello \"World\"");

        System.out.println("Hello World".length()); // 11
        //Hello, kyu ... kyu ... kyu ... bye.
        System.out.println("Hello leezche ... bye".replace("leezche", "egoing"));
        System.out.println("Hello [[[name]]] ... bye".replace("[[[name]]]", "egoing"));


//        souf
        System.out.printf("six & 6");//String six & 6 문자열
//        soutm
        System.out.println("Main.main");
//        soutp
        System.out.println("args = " + Arrays.deepToString(args));
//        soutv
        System.out.println("args = " + args);
    }
}
