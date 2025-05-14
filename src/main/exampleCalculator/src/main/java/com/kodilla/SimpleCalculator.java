package com.kodilla;

class SimpleCalculator
{
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int a, int b) {
        return a - b;
    }
}

class Application
{
    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int result = simpleCalculator.addAToB(59, 5);

        System.out.println(result);

    }
}