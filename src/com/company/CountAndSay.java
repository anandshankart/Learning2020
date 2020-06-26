package com.company;

import java.util.Map;

public class CountAndSay {

    public static void main(String[] args) {

        Dummy dummy = new Dummy();
//        System.out.println(Dummy.say("1211"));
        System.out.println(dummy.countAndSay(6));


//        CountAndSay solution = new CountAndSay();
//        solution.countAndSay(11345);
//        String abc = "12345";
//        System.out.println(abc.length());
    }


    public String countAndSay(int n){
        String answer ="1";
        if (n==1){
            return answer;
        }else{
            for (int i =1;i<n;i++){
                answer = say(answer);
//                System.out.println("New Answer : "+answer);
            }
        }
        return answer;
    }
    public static String say(String number){
//        String number = Integer.toString(n);
        if(number.equalsIgnoreCase("1")){
            return "11";
        }


        char [] numberArray  = number.toCharArray();
        int count=1;
        String answer="";
        for(int i =0; i<numberArray.length-1; i++){
//            System.out.println("Element at index: "+i+" is "+numberArray[i]);
//            System.out.println("Array Length : "+numberArray.length);
            if(numberArray[i]== numberArray[i+1]){
                count ++;
//                    System.out.println("count is now :"+count);
            }else{
                answer += count+""+numberArray[i];
//                    System.out.println("answer is now : "+answer);
                count=1;
            }
            if(i==numberArray.length-2){
                answer +=count+""+numberArray[i+1];
//                    System.out.println("end is here sp answer is now: "+answer);
            }
        }
        return answer;
    }


    /*
    public int countAndSay(int n) {


        String numberString  = Integer.toString(n);
        char [] array = numberString.toCharArray();

        for (int i =1;i <n; i++) {

            if (i==1){
                return '1';
            }else{
                int temp = countAndSay(n-1);
                if(temp==1){
                    return 11;
                }else{
                    Integer.toString(temp);
                }
            }
            if(i+1 < array.length)
            {
                int count=0;
                System.out.println("i and i+1 : "+i+" "+ (i+1));
                while(array[i]==array[i+1]){
                    count++;
                    i++;
                }
//                System.out.println(" "+(count+1)+ array[i]);
            }
        }





        *//*
        String result = "";
        String numberString = Integer.toString(n);
        int [] array = new int[numberString.length()];
        System.out.println("Number : "+n);
        for (int i = numberString.length()-1; i>0; i--) {
            // Take out each digit from the highest digit and store in array
            System.out.println("i : "+i);
            System.out.println("n : "+n);
            n = (int) (n/(Math.pow(10, i)));
            array[i] = n;
            System.out.println(array[i]);
//            n=n/10;
            System.out.println("new value of n : "+n);
            System.out.println();
        }
        for(int i :array){
            System.out.println("i : "+i);
        }
*//*
        return 1;
    }


    public static String getString(int num){
        Map <Integer, String> stringMap = Map.of(
                1,"one",
                2,"two",
                3,"three",
                4,"four",
                5,"five",
                6,"six",
                7,"seven",
                8,"eight",
                9,"nine"
        );
        return stringMap.get(num);
    }*/

}
