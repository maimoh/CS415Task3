package org.example;

public class Calculator {

    // دالة بسيطة للجمع
    public int add(int a, int b) {
        return a + b;
    }

    // دالة للطرح
    public int subtract(int a, int b) {
        return a - b;
    }

    // دالة للضرب
    public int multiply(int a, int b) {
        return a * b;
    }

    // دالة للقسمة
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }
}
