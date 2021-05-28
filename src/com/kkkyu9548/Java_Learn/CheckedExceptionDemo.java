package com.kkkyu9548.Java_Learn;

import java.io.*;
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            String input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(input);
    }
}