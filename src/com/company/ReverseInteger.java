package com.company;
import java.io.*;
import java.util.*;

public class ReverseInteger {
    public static void main(String[] args) {
        List<Integer> inputs = Arrays.asList(
                123,
                -123,
                120,
                -180
        );

        for (int input: inputs) {
            System.out.println(reverse(input));
        }

    }

    // input 321
    // result 0

    // 3, 2, 1,
    // digit: 1
    // remainig digit: 32
    // old_answer: 0
    // new_answer: digit + old_answer



    // digit: 2
    // remaining digit: 3
    // old answer = 1
    // new answer = 12


    // digit: 3
    // remaining digit: 0
    // old answer = 12
    // new answer = 123

    //(old answer)*10 + digit


    // 100 + 20 + 3

    // 1 * 10^ size of int
    // 1 +
    //


    // 3
    // 2 * 10  + 3
    // 1 * 10 * 10 + 23

    // 32
    // 3 * 1
    // 2 * 10

    // 3+ 20


    // 1
    // 1

    // 21
    // 2
    // 1 * 10

    // 321
    // 3
    // 2 * 10
    // 1 * 10 * 10

    // digit + 10 * (i)



    public static int reverse(int number) {
        // check igf given number is negative
        // Reverse the number

        // loop invariant
        // pre-condition
        // logic
        // increment
        // post-condition
        int i = 0;
        int answer = 0;

        if (number<0){
            return -1 * reverse(-1 * number);
        }
        // number > 0
        // number remaining number
        // answer answer so far
        // number = 0, answer
        while (number>0) {

            // separate each digit
            int digit = number%10;

            // given digit + 10 * (i)
            answer = (answer * 10) + digit;

            number=number/10;
            i++;
        }

        return answer;
    }

    public static int reverse2(int number, int old_answer) {
        if (number == 0) {
            return old_answer;
        }

        int digit = number % 10;
        int new_answer = old_answer * 10 + digit;
        int new_number = number / 10;
        return reverse2(new_number, new_answer);
    }

    public static int reverse3(int number) {
        if (number == 0) {
            return number;
        }
        if (number < 0) {
            int new_number = number * -1;
            return -1 * reverse3(new_number);
        }
        int digit = number % 10;
        int new_number = number / 10;
        return digit + (10 * reverse3(new_number));
    }


    // old_answer 0
    // remaining_numer 321
    // digit 1

    // new_answer = old_answer * 10 + digit

    // base case
    // incremental



    // 3
    // x : 3 , 0
    // i : 0 , 1
    // answer : 0 , 3
    // digit : 3

    // 32
    // x : 32 , 3 , 0
    // i : 0, 1 , 2
    // answer : 0 , 2, 23
    // digit : 2 , 3

    // 321
    // x : 321, 32 , 3 , 0
    // i : 0  , 1 , 2 , 3
    // answer : 0 , 1 , 12, 123
    // digit : 1 , 2 , 3






    // answer: 0, 2, 32
    // x: 32, 3 , 0
    // i: 0, 1 2
    //digit 2 , 3



}