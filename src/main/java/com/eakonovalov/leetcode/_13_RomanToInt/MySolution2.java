package com.eakonovalov.leetcode._13_RomanToInt;

public class MySolution2 implements Solution {

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    if (s.length() > i + 1) {
                        switch (s.charAt(i + 1)) {
                            case 'V' -> {
                                result += 4;
                                i += 1;
                            }
                            case 'X' -> {
                                result += 9;
                                i += 1;
                            }
                            default -> result += 1;
                        }
                    }
                    else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (s.length() > i + 1) {
                        switch (s.charAt(i + 1)) {
                            case 'L' -> {
                                result += 40;
                                i += 1;
                            }
                            case 'C' -> {
                                result += 90;
                                i += 1;
                            }
                            default -> result += 10;
                        }
                    }
                    else {
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (s.length() > i + 1) {
                        switch (s.charAt(i + 1)) {
                            case 'D' -> {
                                result += 400;
                                i += 1;
                            }
                            case 'M' -> {
                                result += 900;
                                i += 1;
                            }
                            default -> result += 100;
                        }
                    }
                    else {
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    return -1;
            }
        }

        return result;
    }
}
