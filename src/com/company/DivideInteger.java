package com.company;

import java.util.Arrays;
import java.util.List;

public class DivideInteger {

    public static void main(String[] args) {
        DivideInteger solution = new DivideInteger();
        int answer = solution.divide(-2147483648, -1);
        System.out.print(answer);
//        System.out.println(solution.divide(-5, -2));
//        System.out.println(solution.divide(5, -2));
//        System.out.println(solution.divide(-5, 2));
//        System.out.println(solution.divide(5, 2));

    }

    public int divide(int dividend, int divisor) {
//        System.out.print(dividend + "/" + divisor + " = ");
        //Handle special cases 0/0, 0/1
        if (dividend == 0) {
            return 0;
        }
        long reminder = dividend;
        long quotient = 0;
        boolean sameSign = isSameSign(dividend, divisor);

        //1 : If any negative numbers Reverse the sign. Dont worry we'll restore it back.
        reminder = getAbsoluteValue(dividend);
        long absDivisor = getAbsoluteValue(divisor);

        System.out.println(String.format("New Reminder, New Divisor : %s / %s", reminder, absDivisor));

        while (reminder >= absDivisor) {
            reminder = reminder - absDivisor;
            quotient++;
        }

//        long answer;
        if (!sameSign)
            quotient = quotient * -1;
//        else
//            quotient = quotient;

        System.out.println("Quotient : "+quotient);
        if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) quotient;
        }
    }

    public static long getAbsoluteValue(int number) {
        long answer = number;
        if (answer < 0) {
//            if (number == Integer.MIN_VALUE) {
//                return Integer.MAX_VALUE;
//            }
            return answer * -1;
        }
        return answer;
    }

    public static boolean isSameSign(long num1, long num2) {
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            return false;
        } else
            return true;
    }
}