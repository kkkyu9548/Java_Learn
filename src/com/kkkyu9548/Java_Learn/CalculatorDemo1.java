package com.kkkyu9548.Java_Learn;
//Calculators 메소드와 Calator 클래스가 같은 이름이었는데 충돌이어서 에러가 발생했다.
//임시로 메소드명에 -s를 추가해서 다른 메소드로 바꿔서 넘어가서 진행했다.
class Calculators {
    int left, right;

    public Calculators(int left, int right) {
        this.left = left;//생성자
        this.right = right;//생성자
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo1 {

    public static void main(String[] args) {

        Calculators c1 = new Calculators(10, 20);//생성자
        c1.sum();
        c1.avg();

        Calculators c2 = new Calculators(20, 40);//생성자
        c2.sum();
        c2.avg();
    }

}