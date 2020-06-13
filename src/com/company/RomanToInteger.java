package com.company;

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        List<String> inputs = Arrays.asList(
                "X",
                "XX",
                "IV",
                "IX",
                "XIX",
                "XIV",
                "XXIV",
                "XXIX",
                "XXX",
                "XXXIII",
                "XXXIV",
                "LVIII"

        );
        RomanToInteger solution = new RomanToInteger();
        for (String input: inputs) {
            solution.romanToInt(input);
            System.out.println(input +" " + solution.romanToInt(input));
        }

    }

    public int romanToInt(String s){
        char [] characterArray = s.toCharArray();
        int tempResult=0;

        /**
         * I --> V, X
         * X --> L, C
         * C --> D, M
         *
         * [I, X, C]
         * [V,X]
         * [L,C]
         * [D,M]
         *
         *
         */

        Map<Character, List<Character> > relatives = Map.of(
                'I', List.of('V','X'),
                'X', List.of('L','C'),
                'C', List.of('D','M')
        );




        for (int i=0; i<characterArray.length;  i++){
            if(characterArray.length >1 && i < characterArray.length-1){

                List<Character> characters = relatives.get(characterArray[i]);
                if(characters==null){
                    tempResult += getValue(characterArray[i]);
                }else{

                    if (characters.contains(characterArray[i+1])){
                        tempResult += getValue(characterArray[i+1]) - getValue(characterArray[i]);
                        i++;
                    }else{
                        tempResult += getValue(characterArray[i]);
                    }

                }

                /*if (characterArray[i] == 'I' ){
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
                }*/
            }else{
                tempResult += getValue(characterArray[i]);
            }
        }
        return tempResult;
    }

    public static int getValue(char input){

        Map<Character, Integer> romanToInt = Map.of('I', 1,
                'X', 10,
                'V', 5,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        return romanToInt.get(input);
    }

}
