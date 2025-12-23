package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int num) {
        String stringNum = String.valueOf(num).replace("-","");
        String reversedStringNum = "";
        for (int i = 0; i < stringNum.length(); i++) {
            reversedStringNum = stringNum.charAt(i) + reversedStringNum;
        }

        return stringNum.equals(reversedStringNum);
    };

    public static boolean isPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        } else {
            int sum = 0;
            for (int i = 1; i <= num/2; i++) {
                if (num % i == 0) {
                    sum = sum + i;
                }
            }
            return num == sum;
        }
    }

    public static String numberToWords(int num) {
        if (num < 0) return "Invalid Value";

        String s = String.valueOf(num);
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (i > 0) result += " ";

            switch (s.charAt(i)) {
                case '0': result += "Zero"; break;
                case '1': result += "One"; break;
                case '2': result += "Two"; break;
                case '3': result += "Three"; break;
                case '4': result += "Four"; break;
                case '5': result += "Five"; break;
                case '6': result += "Six"; break;
                case '7': result += "Seven"; break;
                case '8': result += "Eight"; break;
                case '9': result += "Nine"; break;
            }
        }

        return result;
    }

}
