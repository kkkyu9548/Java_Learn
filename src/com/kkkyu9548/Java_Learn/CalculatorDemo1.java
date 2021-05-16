package com.kkkyu9548.Java_Learn;

class Calculators {
    int left, right;

    public Calculators(int left, int right) {
        this.left = left;
        this.right = right;
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

        Calculators c1 = new Calculators(10, 20);
        c1.sum();
        c1.avg();

        Calculators c2 = new Calculators(20, 40);
        c2.sum();
        c2.avg();
    }

}