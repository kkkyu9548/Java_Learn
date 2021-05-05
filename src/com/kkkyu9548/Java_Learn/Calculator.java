package com.kkkyu9548.Java_Learn;

class Calculate {   //1. 왜 클래스에 public이 붙었을 때 에러가 났는지
    int left, right;

    public void setOprand(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println("두 수의 합은 "+(this.left+this.right));  //괄호
    }
    public void avg(){
        System.out.println("두 수의 평균은 "+(this.left+this.right)/2);
    }
}
public class Calculator {

    public static void main(String[] args) {

        Calculate c1 = new Calculate();
        c1.setOprand(10, 20);
        c1.sum();
        c1.avg();

        Calculate c2 = new Calculate();
        c2.setOprand(20, 50);
        c2.sum();
        c2.avg();

    }
}
