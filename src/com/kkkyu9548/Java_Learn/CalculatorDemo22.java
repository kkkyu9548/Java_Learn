package com.kkkyu9548.Java_Learn;


class MultiplicationableCalculator extends Calculatorss {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

public class CalculatorDemo22 {

    public static void main(String[] args) {

        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
    }

}