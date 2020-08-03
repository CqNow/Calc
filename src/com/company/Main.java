package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbs = scanner.nextLine().split(" ");

        CheckString checkString = new CheckString();
        Calc calc = new Calc();

        if (checkString.checkingString(numbs[0]) == true) {
            System.out.println(calc.calculator(Integer.parseInt(numbs[0]), Integer.parseInt(numbs[2]), numbs[1]));
        } else {
            int num1 = RomanToArabic.toArabic(numbs[0]);
            int num2 = RomanToArabic.toArabic(numbs[2]);
            int arabicSum = calc.calculator(num1, num2, numbs[1]);
            System.out.println(ArabicToRoman.toRoman(arabicSum));
        }
    }
}