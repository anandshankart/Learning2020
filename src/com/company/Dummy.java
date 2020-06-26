package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Dummy {
    public static void main(String[] args) {
        Dummy dummy = new Dummy();
//        System.out.println(Dummy.say("1211"));
        System.out.println(dummy.countAndSay(6));

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
}
