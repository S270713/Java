package com.Java.Lesson_4.calculator;

import java.lang.Math;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private String example;
    private String oper;
    private double result = 0;

    public double getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getExample() {
        return example;
    }
    public void setExample(String example) {
        this.example = example;
    }

    public String getOper() {
        return oper;
    }
    public void setOper(String oper) {
        this.oper = oper;
    }

    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        this.result = result;
    }

    public double calculate() {
        switch (oper) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "^":
                result = Math.pow(firstNumber, secondNumber);
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
        }
        return result;
    }
}