package com.company;

import java.util.Map;

public class StringToInteger {
    public static void main(String[] args) {
        StringToInteger solution = new StringToInteger();
//        System.out.println(solution.myAtoi("-42.123"));
//        System.out.println(solution.myAtoi("42.123"));
//        System.out.println(solution.myAtoi("-91283472332"));
//        System.out.println(solution.myAtoi("     -42"));
//        System.out.println(solution.myAtoi("42 with words"));
//        System.out.println(solution.myAtoi("-42 a "));
//        System.out.println(solution.myAtoi("-42"));
//        System.out.println(solution.myAtoi("+42"));
//        System.out.println(solution.myAtoi("-4223456789098765434567890987654"));
//        System.out.println(solution.myAtoi("42345678909876540987654567890987652"));
        System.out.println(solution.myAtoi("+"));
        System.out.println(solution.myAtoi("  -0012a42"));
    }
    public int myAtoi(String str) {
        long solution= 0;
        int sign =1;
        int index=0;
        str = str.trim();
        char []array = str.toCharArray();
        if(array.length<1)
            return 0;
        TYPE firstCharType = findType(array[0]);
        if(firstCharType.equals(TYPE.SYMBOL)){
            if (array[0]=='-'){
                sign=-1;
            }
            index++;
        }
        if(index < array.length && findType(array[index]).equals(TYPE.NUMBER)){
            for(int i =index; i<array.length; i++){
                if (findType(array[i]).equals(TYPE.NUMBER)){
                    solution= solution*10 + getValue(array[i]);
                }else if (findType(array[i]).equals(TYPE.DOT)){
                    return processSolution(solution, sign);
                }
                else
                    return processSolution(solution, sign);
//                solution = processSolution(solution, sign);
                if (solution> Integer.MAX_VALUE && sign==1){
                    return Integer.MAX_VALUE;
                }else if (solution> Integer.MAX_VALUE && sign==-1){
                    return Integer.MIN_VALUE;
                }
            }
        }else{
            return 0;
        }
        solution = solution*sign;
        return (int) solution;
    }
    public int processSolution(long solution, int sign){
        if (solution> Integer.MAX_VALUE && sign==1){
            return Integer.MAX_VALUE;
        }else if (solution> Integer.MAX_VALUE && sign==-1){
            return Integer.MIN_VALUE;
        }
        return (int) solution*sign;
    }
    public TYPE findType(char x ){
        switch (x){
            case '-':
                return TYPE.SYMBOL;
            case '+':
                return TYPE.SYMBOL;
            case '1':
                return TYPE.NUMBER;
            case '2':
                return TYPE.NUMBER;
            case '3':
                return TYPE.NUMBER;
            case '4':
                return TYPE.NUMBER;
            case '5':
                return TYPE.NUMBER;
            case '6':
                return TYPE.NUMBER;
            case '7':
                return TYPE.NUMBER;
            case '8':
                return TYPE.NUMBER;
            case '9':
                return TYPE.NUMBER;
            case '.':
                return TYPE.DOT;
            case '0':
                return TYPE.NUMBER;
            case '\0':
                return TYPE.SPACE;

        }

        return  TYPE.ALPHABETS;
    }

    public enum TYPE{
        SYMBOL,
        SPACE,
        DOT,
        NUMBER,
        ALPHABETS;
    }

    public int getValue(char x){
        Map<Character, Integer> charToInt = Map.of('1', 1,
                '2', 2,
                '3', 3,
                '4', 4,
                '5', 5,
                '6', 6,
                '7', 7,
                '8',8,
                '9',9,
                '0',0);

        return charToInt.get(x);
    }

}
