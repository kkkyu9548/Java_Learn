package com.kkkyu9548.Java_Learn;

class Calculatore {
    int left, right;

    public void setOprands(int left, int right) {
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

class SubstractionableCalculator extends Calculatore {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo2 {

    public static void main(String[] args) {

        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }

}