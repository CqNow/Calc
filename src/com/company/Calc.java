package com.company;

public class Calc {

    public int calculator(int a, int b, String operation) {
        if ((a > 0 && b > 0) && (a <= 10 && b <= 10)) {
            switch (operation) {
                case ("+"):
                    return a + b;
                case ("-"):
                    return a - b;
                case ("/"):
                    return a / b;
                case ("*"):
                    return a * b;
            }
        } else {
            throw new IllegalArgumentException("Error.Invalid input");
        }
        return 0;
    }
}

