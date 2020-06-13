package com.company;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<String> inputs = Arrays.asList(
//                "X",
//                "XX",
//                "IV",
//                "IX",
//                "XIX",
//                "XIV",
//                "XXIV",
//                "XXIX",
//                "XXX",
//                "XXXIII",
//                "XXXIV",
                "LVIII"

        );
        Solution solution = new Solution();
        for (String input: inputs) {
            solution.romanToInt(input);
            System.out.println(input +" " + solution.romanToInt(input));
        }

    }

    public int romanToInt(String s){
        char [] characterArray = s.toCharArray();
        int tempResult=0;
        for (int i=0; i<characterArray.length;  i++){
            if(characterArray.length >1 && i < characterArray.length-1){
                if (characterArray[i] == 'I' ){
                    // Get next character's value and subtract it with current character value.
                    if(characterArray[i+1] == 'V'|| characterArray[i+1] =='X') {
                        tempResult += getValue(characterArray[i + 1]) - getValue(characterArray[i]);
                        i++;
                    }else{
                        tempResult += getValue(characterArray[i]);
                    }
                }else if (characterArray[i] == 'X'){
                    // Get next character's value and subtract it with current character value.
                    if(characterArray[i+1] == 'L'|| characterArray[i+1] =='C') {
                        tempResult += getValue(characterArray[i + 1]) - getValue(characterArray[i]);
                        i++;
                    }else{
                        tempResult += getValue(characterArray[i]);
                    }
                }else if ( characterArray[i] == 'C'){
                    // Get next character's value and subtract it with current character value.
                    if(characterArray[i+1] == 'D'|| characterArray[i+1] =='M') {
                        tempResult += getValue(characterArray[i + 1]) - getValue(characterArray[i]);
                        i++;
                    }else{
                        tempResult += getValue(characterArray[i]);
                    }
                }else{
                    tempResult += getValue(characterArray[i]);
                }
            }else{
                tempResult += getValue(characterArray[i]);
            }
        }
        return tempResult;
    }

    public static int getValue(char input){
        switch (input){
            case 'I':
                return 1;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

}
