package org.example;

public class Main {
    public static String converter(int value) {
        return switch (value) {
            case 1000 -> "M";
            case 900 -> "CM";
            case 500 -> "D";
            case 400 -> "CD";
            case 100 -> "C";
            case 90 -> "XC";
            case 50 -> "L";
            case 40 -> "XL";
            case 10 -> "X";
            case 9 -> "IX";
            case 5 -> "V";
            case 4 -> "IV";
            case 1 -> "I";
            default -> "";
        };
    }

    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder ans = new StringBuilder();

        for (int value : values) {
            while (num >= value) {
                num -= value;
                ans.append(converter(value));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}