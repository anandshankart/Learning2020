package com.company;

public class Pallindrome {

    public static void main(String[] args) {
        Pallindrome solution = new Pallindrome();
        System.out.println(solution.isPallindrome(123));
        System.out.println(solution.isPallindrome(-123));
        System.out.println(solution.isPallindrome(800));
        System.out.println(solution.isPallindrome(121));
        System.out.println(solution.isPallindrome(-121));
//        System.out.println(solution.reverseInt(-123));
//        System.out.println(solution.reverseInt(940));


    }

    public int romanToInt(String s) {
        int number=0;
        char[] char_array = s.toCharArray();
        for (int i=0; i<char_array.length; i++){

        }
        return number;
    }

    public static boolean isPallindrome(int x){
        if (x>=0 && x == reverseInt(x)){
            return true;
        }
        return false;

    }


    public static int reverseInt(int number){
        int answer =0;
        int digit =0;
        if (number == 0) {
            return number;
        }
        if (number < 0) {
//            int new_number = number * -1;
            return -1 * reverseInt(-1 * number);
        }
        while(number>0){
            digit = number % 10;
            answer = (answer*10)+digit;
            number = number / 10;
        }
        return answer;

    }


}
