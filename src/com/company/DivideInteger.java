package com.company;

import java.util.Arrays;
import java.util.List;

public class DivideInteger {

    public static void main(String[] args) {
        DivideInteger solution = new DivideInteger();
        int answer = solution.divide(-2147483648,-1);
        System.out.print(answer);

    }

    public int divide(int dividend, int divisor){
        System.out.print(dividend +"/"+divisor+" = ");
        //Handle special cases 0/0, 0/1
        if (dividend==0){
            return 0;
        }
        int reminder=dividend;
        int quotient =0;
        boolean sameSign = isSameSign(dividend, divisor);
        boolean isDividendNegative = isNegative(dividend);
        boolean isDivisorNegative = isNegative(divisor);

        //1 : If any negative numbers Reverse the sign. Dont worry we'll restore it back.
        if(isDividendNegative){
            reminder = dividend * -1;
        }
        if (isDivisorNegative){
            divisor = divisor * -1;
        }

        if(reminder > 2147483647){
            return 2147483647;
        }

        // 2 : If Proper Fraction -- convert to improper fraction
        while(reminder>=divisor){
            reminder=reminder-divisor;
            quotient++;
        }

        // 2 :  If improper Fraction
//        if (reminder<divisor){
        if (!sameSign)
            return quotient*-1;
        else
            return quotient;
//        }

//        return reminder;
    }

    public static boolean isNegative(int num){
        if (num<=0)
            return true;
        else
            return false;
    }
    public static boolean isSameSign(int num1, int num2){
        if ((num1<0 && num2>0)||(num1>0 && num2<0)){
            return false;
        }else
            return true;
    }
}